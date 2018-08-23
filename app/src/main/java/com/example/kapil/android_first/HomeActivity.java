package com.example.kapil.android_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

   private TextView tvPassedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       tvPassedData = findViewById(R.id.tv_text);

        Intent intent = getIntent();

        // login
        String Uname = intent.getStringExtra("user_key");
        String Upass = intent.getStringExtra("pass_key");

        // register
        String uname = intent.getStringExtra("User_key");
        String upass = intent.getStringExtra("Pass_key");
        String fname = intent.getStringExtra("Fname_key");
        String lname = intent.getStringExtra("Lname_key");

        if (Upass != null && Uname != null) {
            //1.1 username, password
            // login
            tvPassedData.setText("Username : " + Uname + "\nPassword : " + Upass);
        }else if(uname !=null){
            // register
            tvPassedData.setText("Username : " + uname + "\nPassword : " + upass + "\nFirstName : " + fname + "\nLastName : " + lname );
        }
    }
}
