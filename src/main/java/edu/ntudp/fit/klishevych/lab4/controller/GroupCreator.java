package edu.ntudp.fit.klishevych.lab4.controller;
import edu.ntudp.fit.klishevych.lab4.model.Group;
import edu.ntudp.fit.klishevych.lab4.model.Human;
import edu.ntudp.fit.klishevych.lab4.model.Student;

import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup(String name, Human head, ArrayList<Student> studentList) {
        return new Group(name, head, studentList);
    }
}
