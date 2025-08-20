package com.xworks.storeapp.playstore;

import com.xworks.storeapp.app.Application;
import com.xworks.storeapp.validation.AppValidator;


public class PlayStore {

     Application application;

    public boolean createApp(Application  application){
          boolean appCreated = false;

          AppValidator appValidator = new AppValidator();
        boolean isAppValidated = appValidator.validateApplication(application) ;
        if(isAppValidated){
               this.application = application;
               appCreated = true;

        }
    return appCreated;
    }
    public void getAppInfo(){
        System.out.println("The app name is "+ application.getAppName());
        System.out.println("The app Version is "+ application.getVersion());
        System.out.println("The app Updated on"+ application.getUploadedOn());
        System.out.println("The Required Android are"+ application.getRequiredAndroid());
        System.out.println("The no of Downloads are "+ application.getDewnloads());
        System.out.println("The Size of app is "+ application.getDownloadSize());
        System.out.println("The app is offered By "+ application.getOfferedBy());
        System.out.println("The App was Released on"+ application.getReleasedOn());
        System.out.println("The required Permission for apps are "+ application.getAppPermissions());

    }
    }

