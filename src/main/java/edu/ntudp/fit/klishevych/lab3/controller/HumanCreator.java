package edu.ntudp.fit.klishevych.lab3.controller;
import edu.ntudp.fit.klishevych.lab3.model.Human;
import edu.ntudp.fit.klishevych.lab3.model.Sex;

public class HumanCreator {
    public Human createHuman(String firstName, String fathersName,String lastName, Sex sex) {
        return new Human(firstName, fathersName, lastName, sex);
    }
}
