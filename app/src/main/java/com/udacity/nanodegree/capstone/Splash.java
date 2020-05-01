package com.udacity.nanodegree.capstone;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.udacity.nanodegree.capstone.ui.Activities.Login;

import de.hdodenhof.circleimageview.CircleImageView;

public class Splash extends AppCompatActivity {

    CircleImageView civ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        civ = findViewById(R.id.logo);


        Animation aniRotate = AnimationUtils.loadAnimation(this, R.anim.spin);
        civ.startAnimation(aniRotate);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}
