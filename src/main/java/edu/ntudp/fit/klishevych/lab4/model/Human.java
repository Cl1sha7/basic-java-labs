package edu.ntudp.fit.klishevych.lab4.model;
import java.util.Objects;

public class Human {
    private String firstName;
    private String fathersName;
    private String lastName;
    private Sex sex;

    public Human(String firstName, String fathersName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.lastName = lastName;
        this.sex = sex;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getFathersName() {
        return fathersName;
    }
    public String getLastName() {
        return lastName;
    }
    public Sex getSex() {
        return sex;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) &&
                Objects.equals(fathersName, human.fathersName) &&
                Objects.equals(lastName, human.lastName) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, fathersName, lastName, sex);
    }
}
