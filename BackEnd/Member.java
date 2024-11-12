package com.mycompany.BackEnd;

public class Member implements User {

    private String memberId;
    private String name;
    private String email;
    private String membershipType;
    private String phoneNumber;
    private String status;

    public Member(String memberId, String name, String email, String membershipType, String phoneNumber,
            String status) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    @Override
    public String lineRepresentation() {
        return this.memberId + "," + this.name + "," + this.email + "," + this.membershipType + "," + this.phoneNumber
                + "," + this.status;
    }

    @Override
    public String getSearchKey() {
        return this.memberId;
    }

}
