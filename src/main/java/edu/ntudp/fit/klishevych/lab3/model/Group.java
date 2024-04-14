package edu.ntudp.fit.klishevych.lab3.model;
import java.util.List;

public class Group extends Structure<Student> {
    public Group(String name, Human head, List<Student> subElement) {
        super(name, head, subElement);
    }
}
