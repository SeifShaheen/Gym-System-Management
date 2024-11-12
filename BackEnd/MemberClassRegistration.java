package com.mycompany.BackEnd;

import java.time.LocalDate;

public class MemberClassRegistration implements User {

    private String memberID, classID, status;
    private LocalDate registrationDate;

    public MemberClassRegistration(String memberID, String classID, LocalDate registrationDate, String status) {
        this.memberID = memberID;
        this.classID = classID;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public String getMemberID() {
        return memberID;
    }

    public String getClassID() {
        return classID;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String lineRepresentation() {
        return memberID + "," + classID + "," + registrationDate + "," + status;
    }

    @Override
    public String getSearchKey() {
        return this.memberID + this.classID;
    }

}
