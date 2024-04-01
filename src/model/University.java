package model;

import java.util.List;
import java.util.Objects;

public class University {

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

    private List<Faculty> facultyList;
    public List<Faculty> getFaculties() {
        return facultyList;
    }
    public void setFaculties(List<Faculty> listFaculties) {
        this.facultyList = listFaculties;
    }

    @Override
    public String toString() {
        return String.format("University{name='%s', head=%s, faculties=%s}", name, head, facultyList);
    }

}

