package com.example.kapil.android_first.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.kapil.android_first.R;
import com.example.kapil.android_first.models.User;

public class HomeActivity extends AppCompatActivity {

   private TextView tvPassedData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       tvPassedData = findViewById(R.id.tv_text);

        Intent intent = getIntent();

        // login

        User user = intent.getParcelableExtra("User_key");

        /*the below field is not used coz in the User-key we have already defined them*/
//        String Uname = intent.getStringExtra("user_key");
//        String Upass = intent.getStringExtra("pass_key");

        // register
       // User user1 = intent.getParcelableExtra("User_key");




//        String uname = intent.getStringExtra("User_key");
//        String upass = intent.getStringExtra("Pass_key");
//        String fname = intent.getStringExtra("Fname_key");
//        String lname = intent.getStringExtra("Lname_key");

        if (user.Fname == null && user.Lname == null) {
            //1.1 username, password
            // login
            tvPassedData.setText("Username : " + user.uname + "\nPassword : " + user.upass);
        }else if(user.Fname !=null){
            // register
            tvPassedData.setText("Username : " + user.uname + "\nPassword : " + user.upass + "\nFirstName : " + user.Fname + "\nLastName : " + user.Lname );
        }
    }
}
