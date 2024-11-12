package com.mycompany.BackEnd;

import java.time.LocalDate;

public class MemberClassRegistrationDatabase extends Database<MemberClassRegistration> {

    public MemberClassRegistrationDatabase(String fileName) {
        super(fileName);
    }

    @Override
    protected MemberClassRegistration createRecordFrom(String line) {
        String[] values = line.split(",");
        String memberID = values[0];
        String classID = values[1];
        LocalDate registrationDate = LocalDate.parse(values[2]);
        String status = values[3];

        MemberClassRegistration c = new MemberClassRegistration(memberID, classID, registrationDate, status);
        return c;
    }

}
