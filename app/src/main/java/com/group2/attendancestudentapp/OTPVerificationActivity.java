package com.group2.attendancestudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OTPVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p_verification);
        getSupportActionBar().hide();
    }
}