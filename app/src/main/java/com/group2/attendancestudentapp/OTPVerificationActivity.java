package com.group2.attendancestudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class OTPVerificationActivity extends AppCompatActivity {

    Button verifyOTPBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_verification);
        Objects.requireNonNull(getSupportActionBar()).hide();

        verifyOTPBtn = findViewById(R.id.verifyOTPBtn);
        verifyOTPBtn.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), HomeActivity.class)));
    }
}