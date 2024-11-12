package com.mycompany.BackEnd;

import java.util.ArrayList;

public class AdminRole {

    private TrainerDatabase database;

    public AdminRole() {
        database = new TrainerDatabase(FileNames.TRAINER_FILENAME);
    }

    public void addTrainer(String trainerId, String name, String email, String specialty, String phoneNumber) {
        Trainer t = new Trainer(trainerId, name, email, specialty, phoneNumber);
        if (!database.contains(trainerId)) {
            this.database.insertRecord(t);
            System.out.println("Trainer Was Added Succefully!!");
        } else {
            System.out.println("Trainer Already Exists!");
        }
    }

    public ArrayList<Trainer> getListOfTrainers() {
        return database.returnAllRecords();
    }

    public void removeTrainer(String key) {
        if (database.contains(key)) {
            database.deleteRecord(key);
            System.out.println("Trainer Was Removed Succefully!");
        } else {
            System.out.println("No Such Trainer!!");
        }
    }

    public void logout() {
        database.saveToFile();
    }
}
