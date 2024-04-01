package controller;
import model.Faculty;
import model.Human;
import model.University;

import java.util.ArrayList;
import java.util.List;

public class UniversityCreator {


    public   University createUniversity(String name, int countFaculties, Human head) {

        University university = new University();
        FacultyCreator facultyCreator = new FacultyCreator();

        university.setName(name);
        university.setHead(head);

        List<Faculty> faculties = new ArrayList<>();

        for (int i = 1; i < countFaculties; i++) {
            faculties.add(facultyCreator.typicalFaculty());
        }

        university.setFaculties(faculties);

        return university;

    }

    public  University typicalUniversity() {

        HumanCreator humanCreator = new HumanCreator();

        return createUniversity("myUniversity", 2, humanCreator.typicalHuman());
    }

}
