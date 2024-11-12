package com.mycompany.BackEnd;

import java.time.LocalDate;
import java.util.ArrayList;

public class TrainerRole {

    private Database memberDatabase, classDatabase, registrationDatabase;

    public TrainerRole() {
        memberDatabase = new MemberDatabase(FileNames.MEMBER_FILENAME);
        classDatabase = new ClassDatabase(FileNames.CLASS_FILENAME);
        registrationDatabase = new MemberClassRegistrationDatabase(FileNames.REGISTRATION_FILENAME);
    }

    public void addMember(String memberID, String name, String email, String membershipType, String phoneNumber,
            String status) {
        Member m = new Member(memberID, name, membershipType, email, phoneNumber, status);
        if (!this.memberDatabase.contains(memberID)) {
            memberDatabase.insertRecord(m);
        }
    }

    public ArrayList<Member> getListOfMembers() {
        return memberDatabase.returnAllRecords();
    }

    public void addClass(String classID, String className, String trainerID, int duration, int maxParticipants) {
        Class c = new Class(classID, className, trainerID, duration, maxParticipants);
        if (!this.classDatabase.contains(classID)) {
            classDatabase.insertRecord(c);
        }
    }

    public ArrayList<Class> getListOfClasses() {
        return classDatabase.returnAllRecords();
    }

    public boolean registerMemberForClass(String memberID, String classID, LocalDate registrationDate) {
        Class c = (Class) classDatabase.getRecord(classID);
        if (c == null) {
        } else if (c.getAvailableSeats() > 0) {
            MemberClassRegistration mc = new MemberClassRegistration(memberID, classID, registrationDate, "active");
            c.setAvailableSeats(c.getAvailableSeats() - 1);
            registrationDatabase.insertRecord(mc);
            return true;
        }
        return false;
    }

    public boolean cancelRegistration(String memberID, String classID) {
        if (this.registrationDatabase.contains(memberID + classID)) {
            MemberClassRegistration mc = (MemberClassRegistration) this.registrationDatabase
                    .getRecord(memberID + classID);
            this.registrationDatabase.records.remove(mc);
            Class c = (Class) classDatabase.getRecord(classID);
            c.setAvailableSeats(c.getAvailableSeats() + 1);
            return true;
        }
        return false;

    }

    public ArrayList<MemberClassRegistration> getListOfRegistrations() {
        return this.registrationDatabase.returnAllRecords();
    }

    public void logout() {
        this.classDatabase.saveToFile();
        this.memberDatabase.saveToFile();
        this.registrationDatabase.saveToFile();
    }
}
