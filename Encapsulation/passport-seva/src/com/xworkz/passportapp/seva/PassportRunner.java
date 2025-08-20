package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportRunner {

        public static void main(String anything[]){

            System.out.println("Main Started");

            PassportUser passportUser = new PassportUser();
            passportUser.setCpvLocation("PO");
            passportUser.setDcdrLocatiom("Bengaluru");
            passportUser.setGivenName("Vilas");
            passportUser.setSurName("Naik");
            passportUser.setDob("17/09/2003");
            passportUser.setEmail("vilasnayak17@gmail.com");
            passportUser.setPassward("Vilas@1727");

            PassportSeva obj=new PassportSeva();
            obj.createPassportUser(passportUser);

            System.out.println("The CPV Location is  "+ passportUser.getCpvLocation());
            System.out.println("The DCDR Location is  "+ passportUser.getDcdrLocatiom());
            System.out.println("The Given Name is  "+ passportUser.getGivenName());
            System.out.println("The SurName is " + passportUser.getSurName());
            System.out.println("The Date of Birth is  "+ passportUser.getDob());
            System.out.println("The Email of user is "+ passportUser.getEmail());
            System.out.println("The Passward is "+ passportUser.getPassward());

        }
    }

