package model;

import java.util.List;
import java.util.Objects;

public class Department  {

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

    private List<Group> groupList;

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    @Override
    public String toString() {

        return String.format("Department{name=%s, head=%s, groups=%s}", name, head, groupList);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Department that)) return false;

        return groupList.equals(that.groupList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupList);
    }
}

