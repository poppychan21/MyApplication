package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        /*Initializing buttons*/
        // for donator register button
        Button donatorRegisterButton = findViewById(R.id.donator_register_btn);
        // for donator sign up button
        Button donatorSignUpButton = findViewById(R.id.donator_signin_btn);
        // for volunteer sign up button
        Button volunteerSignUpButton = findViewById(R.id.volunteer_signin_btn);

        // These sets click listener for each button
        donatorRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Donator_SignUp.class);
                startActivity(intent1);
            }
        });

        donatorSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent2 = new Intent(MainActivity.this, Donator_Register.class);
            startActivity(intent2);
            }
        });

        volunteerSignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Volunteer_SignUp.class);
                startActivity(intent3);
            }
        });
    }
}