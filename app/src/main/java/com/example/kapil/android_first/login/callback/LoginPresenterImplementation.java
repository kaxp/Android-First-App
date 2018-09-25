package com.example.kapil.android_first.login.callback;

public interface LoginPresenterImplementation {
    void onLoginSuccess(String Username, String Password);
    void onError(String message);
}
