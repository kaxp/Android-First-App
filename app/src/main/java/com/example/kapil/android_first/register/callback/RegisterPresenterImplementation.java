package com.example.kapil.android_first.register.callback;

public interface RegisterPresenterImplementation {
    public void onSuccess(String Username, String Password, String Fname, String Lname);
    public void onError(String messagw);
}

