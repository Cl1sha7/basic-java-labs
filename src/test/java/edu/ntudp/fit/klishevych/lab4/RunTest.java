package edu.ntudp.fit.klishevych.lab4;

import edu.ntudp.fit.klishevych.lab4.controller.UniversityCreator;
import edu.ntudp.fit.klishevych.lab4.model.University;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RunTest {

    @Test
    void testJsonReadWrite() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity();

        JsonManager jsonManager = new JsonManager();
        jsonManager.writeToJsonFile(oldUniversity, "University.json");

        University newUniversity = jsonManager.readFromJsonFile("University.json");

        System.out.println("Чи однакові університети? " + oldUniversity.equals(newUniversity));
        assertEquals(oldUniversity, newUniversity);
    }
}
