package edu.ntudp.fit.klishevych.lab3.controller;
import edu.ntudp.fit.klishevych.lab3.model.Student;
import edu.ntudp.fit.klishevych.lab3.model.Human;
import edu.ntudp.fit.klishevych.lab3.model.Sex;

public class StudentCreator {
    public Student createStudent(String firstName, String fathersName, String lastName, Sex sex, String id) {
        HumanCreator humanCreator = new HumanCreator();
        Human human = humanCreator.createHuman(firstName, fathersName, lastName, sex);
        return new Student(human.getFirstName(), human.getFathersName(), human.getLastName(), human.getSex(), id);
    }
}

