import java.util.Scanner;
import java.sql.*;

public class SQLRequest {
    public static void getStudentsByMonth(String month) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DbConnection.connect();
            statement = connection.createStatement();

            String sqlQuery = "SELECT * FROM Students WHERE substr(BirthDate, 6, 2) = '" + month + "'";
            resultSet = statement.executeQuery(sqlQuery);

            int count = 0;
            while (true)
            {
                if(!resultSet.next()) {
                    if(count == 0)
                    {
                        System.out.println("No students born this month!");
                    }return;
                }

                count++;

                int id = resultSet.getInt("id");
                String name = resultSet.getString("Name");
                String surname = resultSet.getString("Surname");
                String patronymic = resultSet.getString("Patronymic");
                String birthDate = resultSet.getString("BirthDate");
                String recordBook = resultSet.getString("RecordBook");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Patronymic: " + patronymic);
                System.out.println("Surname: " + surname);
                System.out.println("BirthDate: " + birthDate);
                System.out.println("Record book number: " + recordBook);
                System.out.println();
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {

            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of month: ");

        String month = scanner.nextLine();
        String newMonth = month.length() > 1 ? month : '0'+month;

        getStudentsByMonth(newMonth);

    }
}


