package edu.ntudp.fit.klishevych.lab4.controller;
import edu.ntudp.fit.klishevych.lab4.model.Department;
import edu.ntudp.fit.klishevych.lab4.model.Faculty;
import edu.ntudp.fit.klishevych.lab4.model.Human;

import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, ArrayList<Department> departmentList) {
        return new Faculty(name, head, departmentList);
    }
}
