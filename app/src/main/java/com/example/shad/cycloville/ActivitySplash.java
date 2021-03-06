package com.example.shad.cycloville;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class ActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ActivitySplash.this, ActivityLogin.class);
                //Intent is used to switch from one activity to another.

                ActivitySplash.this.startActivity(i);
                //invoke the SecondActivity.

                ActivitySplash.this.finish();
                //the current activity will get finished.
            }
        }, 1000);
    }
}
