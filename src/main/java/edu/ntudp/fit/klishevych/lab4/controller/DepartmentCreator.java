package edu.ntudp.fit.klishevych.lab4.controller;
import edu.ntudp.fit.klishevych.lab4.model.Department;
import edu.ntudp.fit.klishevych.lab4.model.Group;
import edu.ntudp.fit.klishevych.lab4.model.Human;

import java.util.ArrayList;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head, ArrayList<Group> groupList) {
        return new Department(name, head, groupList);
    }
}
