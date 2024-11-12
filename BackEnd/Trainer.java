package com.mycompany.BackEnd;

public class Trainer implements User {

    private String TrainerId;
    private String name;
    private String email;
    private String speciality;
    private String phoneNumber;

    public Trainer(String TrainerId, String name, String email, String speciality, String phoneNumber) {
        this.TrainerId = TrainerId;
        this.name = name;
        this.email = email;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String lineRepresentation() {
        return this.TrainerId + "," + this.name + "," + this.email + "," + this.speciality + "," + this.phoneNumber;
    }

    @Override
    public String getSearchKey() {
        return this.TrainerId;
    }

}
