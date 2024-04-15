package edu.ntudp.fit.klishevych.lab4.controller;
import edu.ntudp.fit.klishevych.lab4.model.Human;
import edu.ntudp.fit.klishevych.lab4.model.Sex;
import edu.ntudp.fit.klishevych.lab4.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String fathersName, String lastName, Sex sex, String id) {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createHuman(firstName, fathersName, lastName, sex);
        return new Student(human.getFirstName(), human.getFathersName(), human.getLastName(), human.getSex(), id);
    }
}

