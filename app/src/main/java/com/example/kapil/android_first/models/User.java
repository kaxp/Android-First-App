package com.example.kapil.android_first.models;

public class User {

    private String uname;
    private String upass;
    private String Uname;
    private String Upass;
    private String Fname;
    private String Lname;


    public User(String uname, String upass){
        this.uname = uname;
        this.upass = upass;

    }

    public User(String Uname, String Upass, String Fname, String Lname){
        this.Uname = Uname;
        this.Upass = Upass;
        this.Fname = Fname;
        this.Lname = Lname;
    }


}


