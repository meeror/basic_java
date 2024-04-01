package model;

import java.util.List;
import java.util.Objects;

public class Faculty extends Object {
    private Human head;

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    private int maxNumberOfDepartment;

    public int getNumberOfDepartment() {
        return maxNumberOfDepartment;
    }

    public void setNumberOfDepartment(int maxNumberOfDepartment) {
        this.maxNumberOfDepartment = maxNumberOfDepartment;
    }

    private List<Department> departmentList;

    public List<Department> getDepartmentList() {
        return departmentList;
    }
    public void setDepartments(List<Department> listDepartments) {
        this.departmentList = listDepartments;
    }

    @Override
    public String toString() {

        return String.format("Faculty{boss=%s, maxNumberOfDepartment=%d, departments=%s}", head, maxNumberOfDepartment, departmentList);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Faculty faculty)) return false;

        return maxNumberOfDepartment == faculty.maxNumberOfDepartment &&
                head.equals(faculty.head) &&
                departmentList.equals(faculty.departmentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, maxNumberOfDepartment, departmentList);
    }
}

