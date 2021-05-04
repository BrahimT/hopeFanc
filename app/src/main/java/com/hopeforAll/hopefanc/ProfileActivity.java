package com.hopeforAll.hopefanc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    TextView name, email;
    CircleImageView profileImage;
    Button logOut;
    ImageButton backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileActivity.this, NavigatorActivity.class));
                finish();
            }
        });
        
        logOut = findViewById(R.id.logout_button);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        profileImage = findViewById(R.id.profileImage);

        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
        if (signInAccount != null){
            name.setText(signInAccount.getDisplayName());
            email.setText(signInAccount.getEmail());
            Picasso.get().load(signInAccount.getPhotoUrl()).placeholder(R.drawable.ppp).into(profileImage);

        }

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), GoogleSignInActivity.class);
                startActivity(intent);
            }
        });
    }
}