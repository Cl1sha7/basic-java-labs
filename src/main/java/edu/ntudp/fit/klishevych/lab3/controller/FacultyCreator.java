package edu.ntudp.fit.klishevych.lab3.controller;
import edu.ntudp.fit.klishevych.lab3.model.Department;
import edu.ntudp.fit.klishevych.lab3.model.Human;
import edu.ntudp.fit.klishevych.lab3.model.Faculty;
import java.util.ArrayList;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head, ArrayList<Department> departmentList) {
        return new Faculty(name, head, departmentList);
    }
}
