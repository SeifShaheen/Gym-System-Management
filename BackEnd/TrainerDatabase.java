package com.mycompany.BackEnd;

public class TrainerDatabase extends Database<Trainer> {

    public TrainerDatabase(String fileName) {
        super(fileName);
    }

    @Override
    public Trainer createRecordFrom(String line) {
        String[] values = line.split(",");
        String TrainerId = values[0];
        String name = values[1];
        String email = values[2];
        String speciality = values[3];
        String phoneNumber = values[4];
        Trainer trainer = new Trainer(TrainerId, name, email, speciality, phoneNumber);
        return trainer;
    }
}
