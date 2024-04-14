package edu.ntudp.fit.klishevych.lab3.controller;
import edu.ntudp.fit.klishevych.lab3.model.Group;
import edu.ntudp.fit.klishevych.lab3.model.Human;
import edu.ntudp.fit.klishevych.lab3.model.Department;
import java.util.ArrayList;

public class DepartmentCreator {
    public Department createDepartment(String name, Human head, ArrayList<Group> groupList) {
        return new Department(name, head, groupList);
    }
}
