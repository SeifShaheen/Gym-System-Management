package com.mycompany.BackEnd;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ClassDatabase extends Database<Class> {

    public ClassDatabase(String fileName) {
        super(fileName);
    }

    @Override
    protected Class createRecordFrom(String line) {
        String[] values = line.split(",");
        String classID = values[0];
        String className = values[1];
        String TrainerID = values[2];
        int duration = Integer.parseInt(values[3]);
        int availableSeats = Integer.parseInt(values[4]);

        Class c = new Class(classID, className, TrainerID, duration, availableSeats);
        return c;
    }

}
