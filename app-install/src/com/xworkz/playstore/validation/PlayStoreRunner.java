package com.xworkz.playstore.validation;

import com.xworkz.playstore.storeapp.PlayStore;
import com.xworkz.playstore.storeapplication.Application;

public class PlayStoreRunner {
    public static void main(String[] args) {

        Application application = new Application();
        application.setFirstName("Vilas ");
        application.setLastNmame("U");
        application.setDob("17 Sep 2003");
        application.setBirthCity("Chitraduraga Fort City");
        application.setNationality("Indian");
        application.setLocalAddress("Banglore");
        application.setHouseNo(001);
        application.setPincode(562162);
        application.setPermanentAddress("Hosdurga Chitradurga");
        application.setMotherName("Sheela N");
        application.setFatherName("G K umashankar");
        application.setPhoneNo(8147881947L);
        application.setEmail("vilsnayak17@gmail.com");
        application.setPassward("vilas1727");
        application.setConfirmPassward("vilas1727");
        {

            PlayStore playStore = new PlayStore();
            boolean createApp = playStore.createApp(application);


            if (createApp) {
                playStore.getAppInfo();
            }


        }
    }
}