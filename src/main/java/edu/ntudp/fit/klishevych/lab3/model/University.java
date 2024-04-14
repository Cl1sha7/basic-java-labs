package edu.ntudp.fit.klishevych.lab3.model;
import java.util.List;

public class University extends Structure<Faculty> {
    public University(String name, Human head, List<Faculty> subElement ) {
        super(name, head, subElement);
    }
}
