package edu.ntudp.fit.klishevych.lab4.model;
import java.util.Objects;

public class Student extends Human {
    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Student(String firstName, String fathersName, String lastName, Sex sex, String id) {
        super(firstName, fathersName, lastName, sex);
        setId(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false; // Перевірка наслідуваного методу equals з класу Human
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId());
    }
}
