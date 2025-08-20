package com.xworks.storeapp.app;

public class Application {

    private String appName;
    private String version;
    private String uploadedOn;
    private String requiredAndroid;
    private String dewnloads;
    private String downloadSize;
    private String offeredBy;
    private String releasedOn;
    private String appPermissions;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUploadedOn() {
        return uploadedOn;
    }

    public void setUploadedOn(String uploadedOn) {
        this.uploadedOn = uploadedOn;
    }

    public String getRequiredAndroid() {
        return requiredAndroid;
    }

    public void setRequiredAndroid(String requiredAndroid) {
        this.requiredAndroid = requiredAndroid;
    }

    public String getDewnloads() {
        return dewnloads;
    }

    public void setDewnloads(String dewnloads) {
        this.dewnloads = dewnloads;
    }

    public String getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(String downloadSize) {
        this.downloadSize = downloadSize;
    }

    public String getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
        this.releasedOn = releasedOn;

    }

    public String getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(String offeredBy) {
        this.offeredBy = offeredBy;
    }

    public String getAppPermissions() {
        return appPermissions;
    }

    public void setAppPermissions(String appPermissions) {
        this.appPermissions = appPermissions;
    }
    public String getPermissions(){
        return appPermissions;
    }
}


