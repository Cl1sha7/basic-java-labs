package edu.ntudp.fit.klishevych.lab4.model;
import java.util.List;
import java.util.Objects;

public class Faculty extends Structure<Department> {
    public Faculty(String name, Human head, List<Department> subElement) {
        super(name, head, subElement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(getName(), faculty.getName()) &&
                Objects.equals(getHead(), faculty.getHead()) &&
                Objects.equals(getSubordinates(), faculty.getSubordinates());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHead(), getSubordinates());
    }
}
