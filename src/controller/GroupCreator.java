package controller;
import model.Group;
import model.Student;
import java.util.ArrayList;
import java.util.List;

public class GroupCreator {


    Group createGroup(int countStudents) {

        Group group = new Group();

        StudentCreator studentCreator = new StudentCreator();

        List<Student> listStudents = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            listStudents.add(studentCreator.typicalStudent());
        }

        group.setStudents(listStudents);

        return group;
    }

    Group typicalGroup() {

        Group group = createGroup(2);

        return group;
    }

}

