package model;

import java.util.List;
import java.util.Objects;

public class Faculty {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private Human head;

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
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

        return String.format("Faculty{name=%s, head=%s, departments=%s}", name, head, departmentList);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Faculty faculty)) return false;

        return  head.equals(faculty.head) &&
                departmentList.equals(faculty.departmentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, departmentList);
    }
}

