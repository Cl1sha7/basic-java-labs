package edu.ntudp.fit.klishevych.lab3.model;

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
}
