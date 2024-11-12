package com.mycompany.BackEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

abstract class Database<T> {

    protected String fileName;
    protected ArrayList<User> records;

    public Database(String fileName) {
        this.fileName = fileName;
        this.records = new ArrayList<>();
        readFromFile();
    }

    protected void readFromFile() {
        try {
            File file = new File(this.fileName);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                records.add((User) createRecordFrom(scan.nextLine()));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No Such File!");
        }
    }

    protected abstract T createRecordFrom(String line);

    protected ArrayList<T> returnAllRecords() {
        return (ArrayList<T>) this.records;
    }

    protected boolean contains(String key) {
        for (User t : this.records) {
            if (t.getSearchKey().equalsIgnoreCase(key)) {
                return true;
            }
        }
        return false;
    }

    protected T getRecord(String key) {
        if (contains(key)) {
            for (User t : this.records) {
                if (t.getSearchKey().equalsIgnoreCase(key)) {
                    return (T) t;
                }
            }
        }

        return null;
    }

    protected void insertRecord(User record) {
        if (!this.contains(record.getSearchKey())) {
            this.records.add(record);
        } else {
            System.out.println("ID already exists");
        }
    }

    protected void deleteRecord(String key) {
        if (this.contains(key)) {
            for (int i = 0; i < this.records.size(); i++) {
                if (this.records.get(i).equals(getRecord(key))) {
                    this.records.remove(i);
                    break;
                }
            }
        } else {
            System.out.println("ID is not correct!");
        }
    }

    protected void saveToFile() {
        try {
            PrintWriter pw = new PrintWriter(this.fileName);
            for (User t : this.records) {
                pw.println(t.lineRepresentation());
                pw.flush();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
    }

}
