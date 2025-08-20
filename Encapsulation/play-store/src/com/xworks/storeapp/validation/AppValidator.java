package com.xworks.storeapp.validation;

import com.xworks.storeapp.app.Application;
import com.xworks.storeapp.playstore.PlayStore;

public class AppValidator {
    public boolean validateApplication(Application application){
        boolean isAppicationValidated = false;

        boolean isAppNameValid = false;
        boolean isVersionValid = false;
        boolean isUploadedOnValid = false;
        boolean isRequiredAndriodValid = false;
        boolean isDownloadsValid = false;
        boolean isDownloadSizeValid = false;
        boolean isOfferedByValid = false;
        boolean isReleasedOnValid= false;
        boolean isAppPermissionValid = false;


        if (application.getAppName() != null){
            isAppNameValid = true;
        } else {
            System.out.println(" not Valid ");
        }

        if(application.getVersion() != null){
            isVersionValid = true;
        }else {
            System.out.println("not Valid");
        }

        if(application.getUploadedOn() != null){
            isUploadedOnValid = true;
        }else{
            System.out.println(" not Valid");
        }

        if(application.getRequiredAndroid() != null){
            isRequiredAndriodValid = true;
        }else{
            System.out.println(" not Valid");
        }


        if(application.getDewnloads() != null){
            isDownloadsValid = true;
        }else{
            System.out.println(" not Valid");
        }

        if(application.getDownloadSize() != null){
            isDownloadSizeValid = true;
        }else{
            System.out.println(" not Valid");
        }


        if(application.getOfferedBy() != null){
            isOfferedByValid = true;
        }else{
            System.out.println(" not Valid");
        }

        if(application.getReleasedOn() != null){
            isReleasedOnValid = true;
        }else{
            System.out.println(" not Valid");
        }

        if(application.getPermissions() != null){
            isAppPermissionValid = true;
        }else{
            System.out.println(" not Valid");
        }

        if (isDownloadsValid && isDownloadSizeValid &&isAppNameValid && isVersionValid && isUploadedOnValid &&isRequiredAndriodValid &&isOfferedByValid &&isReleasedOnValid && isAppPermissionValid){

            isAppicationValidated=true;
        }


        return isAppicationValidated;
    }
}
