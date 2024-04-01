package model;

import java.util.List;
import java.util.Objects;

public class Department  {

    private int maxNumberOfGroups;
    private List<Group> groupList;

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public int getMaxNumberOfGroups() {
        return maxNumberOfGroups;
    }

    public void setMaxNumberOfGroups(int maxNumberOfGroups) {
        this.maxNumberOfGroups = maxNumberOfGroups;
    }

    @Override
    public String toString() {

        return String.format("Department{maxGroupsCount=%d, groups=%s}", maxNumberOfGroups, groupList);

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Department that)) return false;

        return maxNumberOfGroups == that.maxNumberOfGroups &&
                groupList.equals(that.groupList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(maxNumberOfGroups, groupList);
    }
}

