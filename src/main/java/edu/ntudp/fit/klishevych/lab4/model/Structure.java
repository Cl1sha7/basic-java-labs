package edu.ntudp.fit.klishevych.lab4.model;
import java.util.Objects;
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure<?> structure = (Structure<?>) o;
        return Objects.equals(name, structure.name) &&
                Objects.equals(Subordinates, structure.Subordinates) &&
                Objects.equals(head, structure.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Subordinates, head);
    }
}
