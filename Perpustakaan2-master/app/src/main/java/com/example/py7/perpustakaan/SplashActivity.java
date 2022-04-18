package com.example.py7.perpustakaan;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportFragmentManager();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent Intent= new Intent(SplashActivity.this, PeminjamanActivity.class);
                startActivity(Intent);
                finish();
            }
        } ,4000);






    }
}