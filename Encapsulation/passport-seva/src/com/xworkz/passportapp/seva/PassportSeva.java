package com.xworkz.passportapp.seva;

import com.xworkz.passportapp.user.PassportUser;

public class PassportSeva {

    PassportUser passportUser;

    public boolean createPassportUser(PassportUser passportUser) {
        boolean passportUserCreated = false;
        boolean cpvLocationValid = false;
        boolean dcdrLocationValid = false;
        boolean givenNameValid = false;
        boolean surNameVAlid = false;
        boolean dobValid = false;
        boolean emailValid = false;
        boolean passwardValid = false;

        if (passportUser.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("The CPV Location is not Valid");
        }
        if (passportUser.getDcdrLocatiom() != null) {
            dcdrLocationValid = true;
        } else {
            System.out.println("The DCDR Location is not Valid");
        }
        if (passportUser.getGivenName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("The Name is not Valid");
        }
        if (passportUser.getSurName() != null) {
            surNameVAlid = true;
        } else {
            System.out.println("The Sur Name is not Valid");
        }
        if (passportUser.getDob() != null) {
            dobValid = true;
        } else {
            System.out.println("The Date of birth is not Valid");
        }
        if (passportUser.getEmail() != null) {
            emailValid = true;
        } else {
            System.out.println("The Email is not Valid");
        }
        if (passportUser.getPassward() != null) {
            passwardValid = true;
        } else {
            System.out.println("The Passward is not Valid");
        }
        if (cpvLocationValid && dcdrLocationValid && givenNameValid && surNameVAlid && emailValid && passwardValid) {
            passportUserCreated = true;
            this.passportUser = passportUser;
        }
        return passportUserCreated;

    }
}
