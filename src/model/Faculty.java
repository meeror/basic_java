package model;

import java.util.List;
import java.util.Objects;

public class Faculty {
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

        return String.format("Faculty{head=%s, departments=%s}", head, departmentList);

    }

}

