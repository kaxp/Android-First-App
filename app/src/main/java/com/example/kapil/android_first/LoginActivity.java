package com.example.kapil.android_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button signUp;

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

                String uName = username.getText().toString();
                String uPass = password.getText().toString();

                if (!uName.isEmpty() && !uPass.isEmpty()){
                    if (uPass.equals("123")){
                        Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                        intent.putExtra("user_key",uName);
                        intent.putExtra("pass_key",uPass);
                        startActivity(intent);


                    }else {
                        Toast.makeText(LoginActivity.this, "Plz Enter Correct Crediantials", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "Plz Enter the Details", Toast.LENGTH_SHORT).show();
                }

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


}
