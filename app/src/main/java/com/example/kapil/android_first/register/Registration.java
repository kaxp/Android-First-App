package com.example.kapil.android_first.register;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kapil.android_first.home.HomeActivity;
import com.example.kapil.android_first.R;
import com.example.kapil.android_first.models.User;
import com.example.kapil.android_first.register.callback.RegisterPresenterImplementation;

public class Registration extends AppCompatActivity implements RegisterPresenterImplementation{


    private EditText UserName;
    private EditText PassWord;
    private EditText FirstName;
    private EditText LastName;
    private Button Reg;
    private RegisterPresenter mRegisterPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        UserName = findViewById(R.id.reg_username);
        PassWord = findViewById(R.id.reg_password);
        FirstName = findViewById(R.id.in_fName);
        LastName = findViewById(R.id.in_lName);
        Reg = findViewById(R.id.btn_reg);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Username = UserName.getText().toString();
                String Password = PassWord.getText().toString();
                String Fname = FirstName.getText().toString();
                String Lname = LastName.getText().toString();

                RegisterPresenter rp = new RegisterPresenter(Registration.this);
                rp.checkRegisterCrediantials(Username,Password,Fname,Lname);

            }
        });
    }

    @Override
    public void onSuccess(String Username, String Password, String Fname, String Lname) {
        Intent intent = new Intent(Registration.this,HomeActivity.class);
        User user = new User(Username,Password,Fname,Lname);
        intent.putExtra("User_key",user);
        startActivity(intent);

    }

    @Override
    public void onError(String message) {
        Toast.makeText(Registration.this, "Plz enter the details", Toast.LENGTH_SHORT).show();

    }
}
