import controller.UniversityCreator;
import model.University;

public class Run {

    public static void main(String[] args) {

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.typicalUniversity();

        System.out.println(university.toString());
    }

}