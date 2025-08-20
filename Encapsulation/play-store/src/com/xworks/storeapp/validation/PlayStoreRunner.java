package com.xworks.storeapp.validation;

import com.xworks.storeapp.app.Application;
import com.xworks.storeapp.playstore.PlayStore;

public class PlayStoreRunner {

    public static void main(String[] args) {

        Application application = new Application();
        application.setAppName("Git Hub");
        application.setVersion("1.22.1");
        application.setUploadedOn("6 aug 2025");
        application.setRequiredAndroid("Android 8.0 and UP");
        application.setDewnloads("1M");
        application.setDownloadSize("11.95");
        application.setOfferedBy("GitHub");
        application.setReleasedOn("15 feb 2020");
        application.setAppPermissions("Show More");

        PlayStore playStore = new PlayStore();
        boolean createApp = playStore.createApp(application);

        if (createApp){
            playStore.getAppInfo();
        }


    }
}
