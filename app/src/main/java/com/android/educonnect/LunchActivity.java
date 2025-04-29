package com.android.educonnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LunchActivity extends AppCompatActivity {

    private static final int DELY_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_parent);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Créeration de Intent pour switcher vers l'activité Main
                Intent intent = new Intent(LunchActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, DELY_TIME);
    }
}