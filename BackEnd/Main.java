package com.mycompany.BackEnd;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TrainerRole trainer = new TrainerRole();
        AdminRole admin = new AdminRole();
        logout:
        while (true) {
            System.out.println("1-Admin");
            System.out.println("2-Trainer");
            System.out.print("Choose your role:");
            String choise = scan.nextLine();
            while (true) {
                try {
                    int c = Integer.parseInt(choise);
                    switch (c) {
                        // Admin Role
                        case 1: {
                            System.out.println("1-Add Trainer");
                            System.out.println("2-Get List Of Trainers");
                            System.out.println("3-Remove Trainer");
                            System.out.println("4-Logout");
                            System.out.println("5-Quit");
                            System.out.print("Choose Operation: ");
                            String chh = scan.nextLine();
                            try {
                                int ch = Integer.parseInt(chh);
                                switch (ch) {
                                    case 1: {
                                        String id, name, email, specialty, phoneNumber;
                                        System.out.print("Enter trainer ID: ");
                                        id = scan.nextLine();
                                        System.out.print("Enter trainer name: ");
                                        name = scan.nextLine();
                                        System.out.print("Enter trainer email: ");
                                        email = scan.nextLine();
                                        System.out.print("Enter trainer specialty: ");
                                        specialty = scan.nextLine();
                                        System.out.print("Enter trainer phone number: ");
                                        phoneNumber = scan.nextLine();
                                        admin.addTrainer(id, name, email, specialty, phoneNumber);
                                        break;
                                    }
                                    case 2: {
                                        ArrayList<Trainer> trainers = admin.getListOfTrainers();
                                        for (Trainer a : trainers) {
                                            System.out.println(a.lineRepresentation());
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("Enter the trainer key: ");
                                        String key = scan.nextLine();
                                        admin.removeTrainer(key);
                                        break;
                                    }
                                    case 4: {
                                        admin.logout();
                                        continue logout;
                                    }
                                    case 5: {
                                        System.exit(0);
                                        break;
                                    }
                                    default: {
                                        System.out.println("Choose from 1 to 5");
                                    }
                                }
                            } catch (NumberFormatException ex) {
                                System.out.println("Wrong input format!");
                            }
                            break;
                        }
                        // Trainer Role
                        case 2: {
                            System.out.println("1-Add Member");
                            System.out.println("2-Get List Of Members");
                            System.out.println("3-Add Class");
                            System.out.println("4-Get List Of Classes");
                            System.out.println("5-Register Member For Class");
                            System.out.println("6-Cancel Registration");
                            System.out.println("7-Get List Of Registration");
                            System.out.println("8-Logout");
                            System.out.println("9-Quit");
                            System.out.print("Choose Operation: ");
                            String chh = scan.nextLine();
                            try {
                                int ch = Integer.parseInt(chh);
                                switch (ch) {
                                    case 1: {
                                        String id, name, email, phoneNumber, membershipType, status;
                                        System.out.print("Enter member ID: ");
                                        id = scan.nextLine();
                                        System.out.print("Enter member name: ");
                                        name = scan.nextLine();
                                        System.out.print("Enter membership type: ");
                                        membershipType = scan.nextLine();
                                        System.out.print("Enter member email: ");
                                        email = scan.nextLine();
                                        System.out.print("Enter member phone number: ");
                                        phoneNumber = scan.nextLine();
                                        System.out.print("Enter member status: ");
                                        status = scan.nextLine();
                                        trainer.addMember(id, name, membershipType, email, phoneNumber, status);
                                        break;
                                    }
                                    case 2: {
                                        ArrayList<Member> members = trainer.getListOfMembers();
                                        for (Member a : members) {
                                            System.out.println(a.lineRepresentation());
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("Enter Class ID: ");
                                        String classID = scan.nextLine();
                                        System.out.print("Enter Class Name: ");
                                        String className = scan.nextLine();
                                        System.out.print("Enter Trainer ID: ");
                                        String trainerID = scan.nextLine();
                                        System.out.print("Enter Duration: ");
                                        int duration = scan.nextInt();
                                        scan.nextLine();
                                        System.out.print("Enter the max number of participants: ");
                                        int maxParticipants = scan.nextInt();
                                        scan.nextLine();
                                        trainer.addClass(classID, className, trainerID, duration, maxParticipants);
                                        break;
                                    }
                                    case 4: {
                                        ArrayList<Class> classes = trainer.getListOfClasses();
                                        for (Class cs : classes) {
                                            System.out.println(cs.lineRepresentation());
                                        }
                                        break;
                                    }
                                    case 5: {
                                        System.out.print("Enter member ID: ");
                                        String memberID = scan.nextLine();
                                        System.out.print("Enter class ID: ");
                                        String classID = scan.nextLine();
                                        System.out.print("Enter registration date(Format yyyy-mm-dd): ");
                                        LocalDate registrationDate = LocalDate.parse(scan.nextLine());
                                        trainer.registerMemberForClass(memberID, classID,
                                                registrationDate);
                                        break;
                                    }
                                    case 6: {// Cancel
                                        System.out.print("Enter member ID: ");
                                        String memberID = scan.nextLine();
                                        System.out.print("Enter class ID: ");
                                        String classID = scan.nextLine();
                                        trainer.cancelRegistration(memberID, classID);
                                        break;
                                    }
                                    case 7: {
                                        ArrayList<MemberClassRegistration> reg = trainer.getListOfRegistrations();
                                        for (MemberClassRegistration r : reg) {
                                            System.out.println(r.lineRepresentation());
                                        }
                                        break;
                                    }
                                    case 8: {
                                        trainer.logout();
                                        continue logout;
                                    }
                                    case 9: {
                                        System.exit(0);
                                        break;
                                    }
                                    default: {
                                        System.out.println("Choose from 1 to 5");
                                    }
                                }
                            } catch (NumberFormatException ex) {
                                System.out.println("Wrong input format!");
                            }
                            break;
                        }
                        default: {
                            System.out.println("Choose from 1 or 2");
                        }
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Wrong input format!");
                }
            }
        }
    }
}
