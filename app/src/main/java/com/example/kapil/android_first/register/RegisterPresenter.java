package com.example.kapil.android_first.register;

import com.example.kapil.android_first.register.callback.RegisterPresenterImplementation;

public class RegisterPresenter {
    private RegisterPresenterImplementation mPresenter;

    public RegisterPresenter(RegisterPresenterImplementation mPresenter){
        this.mPresenter = mPresenter;
    }

    private static final String Tag =" RegisterPresenter";

    public void checkRegisterCrediantials(String Username, String Password, String Fname, String Lname){

        if (!Username.isEmpty() && !Password.isEmpty() && !Fname.isEmpty() && !Lname.isEmpty()){
            mPresenter.onSuccess(Username,Password,Fname,Lname);
        }else {
            mPresenter.onError("Plz enter the details");
        }

    }



}
