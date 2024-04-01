package controller;
import model.Department;
import model.Faculty;
import model.Human;

import java.util.ArrayList;
import java.util.List;

public class FacultyCreator {

    Faculty createFaculty(int countDepartments, Human head) {

        Faculty faculty = new Faculty();
        DepartmentCreator departmentCreator = new DepartmentCreator();
        List<Department> listDepartments = new ArrayList<>();

        for (int i = 0; i < countDepartments; i++) {
            listDepartments.add(departmentCreator.typicalDepartment());
        }

        faculty.setDepartments(listDepartments);
        faculty.setHead(head);

        return faculty;
    }

    Faculty typicalFaculty() {

        HumanCreator humanCreator = new HumanCreator();

        return createFaculty(2, humanCreator.typicalHuman());
    }
}

