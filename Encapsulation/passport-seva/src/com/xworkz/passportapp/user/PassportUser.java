package com.xworkz.passportapp.user;

public class PassportUser {

    private String cpvLocation;
    private String dcdrLocatiom;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private String passward;


    public String getCpvLocation(){
        return cpvLocation;
    }
    public void setCpvLocation(String cpvLocation){
        this.cpvLocation = cpvLocation;
    }
    public String getDcdrLocatiom(){
        return dcdrLocatiom;
    }
    public void setDcdrLocatiom(String dcdrLocatiom){
        this.dcdrLocatiom = dcdrLocatiom;
    }
    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName){
        this.givenName = givenName;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName = surName;
    }
    public String getDob(){
        return dob;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassward(){
        return passward;
    }
    public void setPassward(String passward){
        this.passward = passward;
    }
    }
