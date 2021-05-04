package com.hopeforAll.hopefanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;

public class Splash extends AppCompatActivity {

    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN
            );
        }

        handler=new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if (FirebaseAuth.getInstance().getCurrentUser()==null){
                    startActivity(new Intent(Splash.this, GoogleSignInActivity.class));
                    finish();
                }
                else {
                    startActivity(new Intent(Splash.this, NavigatorActivity.class));
                    finish();
                }
            }
        },3000);
    }
}