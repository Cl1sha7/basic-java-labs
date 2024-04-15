package edu.ntudp.fit.klishevych.lab4.model;
import java.util.List;
import java.util.Objects;

public class University extends Structure<Faculty> {
    public University(String name, Human head, List<Faculty> subElement ) {
        super(name, head, subElement);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getHead(), that.getHead()) &&
                Objects.equals(getSubordinates(), that.getSubordinates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getHead(), getSubordinates());
    }
}
