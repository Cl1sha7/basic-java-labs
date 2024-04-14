package edu.ntudp.fit.klishevych.lab3.model;
import java.util.List;

public class Faculty extends Structure<Department> {
    public Faculty(String name, Human head, List<Department> subElement) {
        super(name, head, subElement);
    }
}
