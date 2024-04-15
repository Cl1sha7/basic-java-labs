package edu.ntudp.fit.klishevych.lab4;

import com.google.gson.Gson;
import edu.ntudp.fit.klishevych.lab4.model.University;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {
    private final Gson gson;

    public JsonManager() {
        this.gson = new Gson();
    }

    public void writeToJsonFile(University university, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            gson.toJson(university, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public University readFromJsonFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName)) {
            return gson.fromJson(fileReader, University.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}