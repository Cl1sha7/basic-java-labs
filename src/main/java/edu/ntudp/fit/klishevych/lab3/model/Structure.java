package edu.ntudp.fit.klishevych.lab3.model;
import java.util.List;

public abstract class Structure<T> {
    private String name;
    private List<T> Subordinates;
    private Human head;

    public List<T> getSubordinates() {
        return Subordinates;
    }
    public Structure(String name, Human head, List<T> Subordinates) {
        this.name = name;
        this.head = head;
        this.Subordinates = Subordinates;
    }
    public void setSubordinates(List<T> Subordinates) {
        this.Subordinates = Subordinates;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Human getHead() {
        return head;
    }
    public void setHead(Human head) {
        this.head = head;
    }
}
