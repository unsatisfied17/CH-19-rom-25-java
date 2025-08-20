package com.xworkz.playstore.validation;

import com.xworkz.playstore.storeapplication.Application;

public class AppValidation {

    public boolean validateApplication(Application application) {
        boolean isApplioationValidated = false;

        boolean isfirstNameValid = false;
        boolean islastNmameValid = false;
        boolean isdobValid = false;
        boolean isbirthCityValid = false;
        boolean isnationalityValid = false;
        boolean islocalAddressValid = false;
        boolean ishouseNoValid = false;
        boolean isPincodeValid = false;
        boolean ispermanentAddressValid = false;
        boolean ismotherNameValid = false;
        boolean isfatherNameValid = false;
        boolean isphoneNoValid = false;
        boolean isemailValid = false;
        boolean ispasswardValid = false;
        boolean isconfirmPasswardValid = false;

        if (application.getFirstName() != null) {
            isfirstNameValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getLastNmame() != null) {
            islastNmameValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getDob() != null) {
            isdobValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getBirthCity() != null) {
            isbirthCityValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getNationality() != null) {
            isnationalityValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getLocalAddress() != null) {
            islocalAddressValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getHouseNo() != 0) {
            ishouseNoValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getPincode() != 0) {
            isPincodeValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getPermanentAddress() != null) {
            ispermanentAddressValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getMotherName() != null) {
            ismotherNameValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getFatherName() != null) {
            isfatherNameValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getPhoneNo() != 0) {
            isphoneNoValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getEmail() != null) {
            isemailValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getPassward() != null) {
            ispasswardValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (application.getConfirmPassward() != null) {
            isconfirmPasswardValid = true;
        } else {
            System.out.println("It's Invalid");
        }
        if (isfirstNameValid && islastNmameValid && isdobValid && isnationalityValid && isbirthCityValid && islocalAddressValid && ishouseNoValid && isPincodeValid && ispermanentAddressValid &&ismotherNameValid && isfatherNameValid &&isphoneNoValid && isemailValid && ispasswardValid && isconfirmPasswardValid) {
            isApplioationValidated = true;
        }
return isApplioationValidated;
    }
}

