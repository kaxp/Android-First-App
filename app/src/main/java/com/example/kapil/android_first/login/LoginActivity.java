package com.example.kapil.android_first.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kapil.android_first.home.HomeActivity;
import com.example.kapil.android_first.login.callback.LoginPresenterImplementation;
import com.example.kapil.android_first.R;
import com.example.kapil.android_first.register.Registration;
import com.example.kapil.android_first.models.User;

public class LoginActivity extends AppCompatActivity implements LoginPresenterImplementation{

    private EditText username;
    private EditText password;
    private Button login;
    private Button signUp;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.in_username);
        password = findViewById(R.id.in_password);
        login = findViewById(R.id.btn_login);
        signUp = findViewById(R.id.btn_signup);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = username.getText().toString();
                String Password = password.getText().toString();

                LoginPresenter lp = new LoginPresenter(LoginActivity.this);
                lp.checkLoginCrediantials(Username, Password);

            }

        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Registration.class);
                startActivity(intent);
            }
        });



    }

    @Override
    public void onLoginSuccess(String Username, String Password) {
        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
        User user = new User(Username, Password);
        intent.putExtra("User_key",user);
        startActivity(intent);
    }

    @Override
    public void onError(String message) {
        Toast.makeText(LoginActivity.this, "Plz enter the crediantials", Toast.LENGTH_SHORT).show();

    }
}

