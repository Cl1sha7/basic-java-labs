package edu.ntudp.fit.klishevych.lab3.controller;
import edu.ntudp.fit.klishevych.lab3.model.Student;
import edu.ntudp.fit.klishevych.lab3.model.Human;
import edu.ntudp.fit.klishevych.lab3.model.Group;
import java.util.ArrayList;

public class GroupCreator {
    public Group createGroup(String name, Human head, ArrayList<Student> studentList) {
        return new Group(name, head, studentList);
    }
}
