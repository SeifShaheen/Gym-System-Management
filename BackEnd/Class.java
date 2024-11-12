package com.mycompany.BackEnd;

public class Class implements User {

    private String classID, className, trainerID;
    private int duration, availableSeats;

    public Class(String classID, String className, String trainerID, int duration, int availableSeats) {
        this.classID = classID;
        this.className = className;
        this.trainerID = trainerID;
        this.duration = duration;
        this.setAvailableSeats(availableSeats);
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String lineRepresentation() {
        return this.classID + "," + this.className + "," + this.trainerID + "," + this.duration + "," + this.availableSeats;
    }

    @Override
    public String getSearchKey() {
        return classID;
    }
}
