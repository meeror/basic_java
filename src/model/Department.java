package model;

import java.util.List;
import java.util.Objects;

public class Department  {
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

        return String.format("Department{head=%s, groups=%s}",head, groupList);

    }

}

