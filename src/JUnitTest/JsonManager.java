package JUnitTest;

import com.google.gson.Gson;
import model.University;

import java.io.*;

public class JsonManager {

    public void writeToJson(Object o, String filePath) {

        Gson gson = new Gson();

        String jsonFile = gson.toJson(o);

        try {
            FileWriter myWriter = new FileWriter(filePath);

            myWriter.write(jsonFile);
            myWriter.close();

            System.out.println("Written to Json File!");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }

    public Object readFromJson(String filePath) {

        Gson gson = new Gson();

        try {
            System.out.println("Read from Json File!");
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

            return null;
        }

    }
}

