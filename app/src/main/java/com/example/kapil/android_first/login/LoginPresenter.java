package com.example.kapil.android_first.login;

import com.example.kapil.android_first.login.callback.LoginPresenterImplementation;

public class LoginPresenter {
    private LoginPresenterImplementation mPresenter;

    public LoginPresenter(LoginPresenterImplementation mPresenter) {
        this.mPresenter = mPresenter;
    }


    private static final String Tag = "LoginPresenter";

    public void checkLoginCrediantials(String Username, String Password){

        if (!Username.isEmpty() && !Password.isEmpty()){
            if (Password.equals("123")){
                    this.mPresenter.onLoginSuccess(Username, Password);
            }else{
                mPresenter.onError("Plz enter correct password");
            }
        }else {
            mPresenter.onError("Plz enter the Crediantials");
        }
    }


}