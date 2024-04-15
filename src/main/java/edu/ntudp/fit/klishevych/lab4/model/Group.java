package edu.ntudp.fit.klishevych.lab4.model;
import java.util.List;
import java.util.Objects;

public class Group extends Structure<Student> {
    public Group(String name, Human head, List<Student> subElement) {
        super(name, head, subElement);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return Objects.equals(getName(), group.getName()) &&
                Objects.equals(getHead(), group.getHead()) &&
                Objects.equals(getSubordinates(), group.getSubordinates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHead(), getSubordinates());
    }
}
