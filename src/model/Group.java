package model;

import java.util.List;
import java.util.Objects;

public class Group  {

    private int maxNumberOfStudents;
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudents(List<Student> listStudents) {
        this.studentList = listStudents;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    @Override
    public String toString() {

        return String.format("Group{maxNumberOfStudents=%d, students=%s}", maxNumberOfStudents, studentList);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Group group)) return false;

        return maxNumberOfStudents == group.maxNumberOfStudents &&
                studentList.equals(group.studentList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maxNumberOfStudents, studentList);
    }
}
