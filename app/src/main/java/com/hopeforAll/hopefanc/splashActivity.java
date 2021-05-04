package com.hopeforAll.hopefanc;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.google.firebase.auth.FirebaseAuth;

public class splashActivity extends Activity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            );
        }

        handler=new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if (FirebaseAuth.getInstance().getCurrentUser()==null){
                    startActivity(new Intent(splashActivity.this, GoogleSignInActivity.class));
                    finish();
                }
                else {
                    startActivity(new Intent(splashActivity.this, NavigatorActivity.class));
                    finish();
                }
            }
        },3000);

    }
}
