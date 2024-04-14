package edu.ntudp.fit.klishevych.lab3.model;
import java.util.List;

public class Department extends Structure<Group> {
    public Department(String name, Human head, List<Group> subElement) {
        super(name, head, subElement);
    }
}
