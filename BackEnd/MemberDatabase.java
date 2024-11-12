package com.mycompany.BackEnd;

public class MemberDatabase extends Database<Member> {

    public MemberDatabase(String fileName) {
        super(fileName);
    }

    @Override
    protected Member createRecordFrom(String line) {
        String[] values = line.split(",");
        String memberId = values[0];
        String name = values[1];
        String email = values[2];
        String membershipType = values[3];
        String phoneNumber = values[4];
        String status = values[5];

        Member member = new Member(memberId, name, membershipType, email, phoneNumber, status);
        return member;
    }

}
