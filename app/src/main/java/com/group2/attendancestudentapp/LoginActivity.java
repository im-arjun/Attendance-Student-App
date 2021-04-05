package com.group2.attendancestudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {

    Button sentOTPBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Objects.requireNonNull(getSupportActionBar()).hide();
            
        sentOTPBtn = findViewById(R.id.sentOTPBtn);
        sentOTPBtn.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), OTPVerificationActivity.class)));
    }
}