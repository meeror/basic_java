package controller;
import model.Human;
import model.Student;

public class StudentCreator {


    public Student createStudent(Human human, int Id) {


        Student student = new Student();
        student.setName(human.getName());
        student.setSurname(human.getSurname());
        student.setPatronymic(human.getPatronymic());

        student.Id(Id);
        student.setSex(human.getSex());

        return student;
    }

    public Student typicalStudent() {

        HumanCreator humanCreator = new HumanCreator();

        Human human = humanCreator.typicalHuman();

        return createStudent(human, 1);
    }

}


