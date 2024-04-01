package controller;
import model.Department;
import model.Group;

import java.util.ArrayList;
import java.util.List;

public class DepartmentCreator {


    public Department createDepartment(int countGroups) {

        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();

        List<Group> listGroups = new ArrayList<>();

        for (int i = 0; i < countGroups; i++) {
            listGroups.add(groupCreator.typicalGroup());
        }

        department.setGroupList(listGroups);

        return department;
    }

    public Department typicalDepartment() {

        return createDepartment(2);
    }
}

