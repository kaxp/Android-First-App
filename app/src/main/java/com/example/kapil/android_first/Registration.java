package com.example.kapil.android_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {


    private EditText UserName;
    private EditText PassWord;
    private EditText FirstName;
    private EditText LastName;
    private Button Reg;

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

                String user = UserName.getText().toString();
                String pass = PassWord.getText().toString();
                String fName = FirstName.getText().toString();
                String lName = LastName.getText().toString();

                if (!user.isEmpty() && !pass.isEmpty() && !fName.isEmpty() && !lName.isEmpty()){
                    Intent intent= new Intent(Registration.this,HomeActivity.class);
                    intent.putExtra("User_key",user);
                    intent.putExtra("Pass_key",pass);
                    intent.putExtra("Fname_key",fName);
                    intent.putExtra("Lname_key",lName);
                    startActivity(intent);

                }else {
                    Toast.makeText(Registration.this, "Plz Enter the Details", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}
