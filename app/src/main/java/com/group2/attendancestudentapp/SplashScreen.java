package com.group2.attendancestudentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ImageView logoSplashScreen;
    TextView welcomeText;
    Animation zoomAnimation, fadeAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        logoSplashScreen = findViewById(R.id.logo);
        welcomeText = findViewById(R.id.welcome_text);

        zoomAnimation = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.zoom);
        logoSplashScreen.setAnimation(zoomAnimation);

        fadeAnimation = AnimationUtils.loadAnimation(SplashScreen.this, R.anim.fade);
        welcomeText.setAnimation(fadeAnimation);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            finish();
        }, 1500);
    }
}