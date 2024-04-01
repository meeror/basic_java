package model;

import java.util.List;
import java.util.Objects;

public class Group  {
    private Human head;

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudents(List<Student> listStudents) {
        this.studentList = listStudents;
    }

    @Override
    public String toString() {

        return String.format("Group{head=%s, students=%s}",head, studentList);

    }

}
