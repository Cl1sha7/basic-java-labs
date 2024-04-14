package edu.ntudp.fit.klishevych.lab3.model;

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
}
