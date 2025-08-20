package com.xworkz.playstore.storeapp;


import com.xworkz.playstore.storeapplication.Application;
import com.xworkz.playstore.validation.AppValidation;

public class PlayStore {

    Application application;

    public boolean createApp(Application application) {
        boolean appCreated = false;

        AppValidation appValidator = new AppValidation();
        boolean isAppValidated = appValidator.validateApplication(application);
        if (isAppValidated) {
            this.application = application;
            appCreated = true;

        }
        return appCreated;
    }

    public void getAppInfo() {
        System.out.println("The First name is " + application.getFirstName());
        System.out.println("The Last Name is " + application.getLastNmame());
        System.out.println("The Date of Birth is " + application.getDob());
        System.out.println("The birth city is  " + application.getBirthCity());
        System.out.println("The Nationality is " + application.getNationality());
        System.out.println("The Local Address is " + application.getLocalAddress());
        System.out.println("The House No is " + application.getHouseNo());
        System.out.println("The Pincode is " + application.getPincode());
        System.out.println("The permanent address is " + application.getPermanentAddress());
        System.out.println("The Mother Name is " + application.getMotherName());
        System.out.println("The Father Name is " + application.getFatherName());
        System.out.println("The contact Number is " + application.getPhoneNo());
        System.out.println("The Email of user is " + application.getEmail());
        System.out.println("The Passward is " + application.getPassward());
        System.out.println("The Confirmed passward is " + application.getConfirmPassward());
    }
}
