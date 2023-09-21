package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button LoginButton = findViewById(R.id.loginButton);
        TextView ForgetPassword = findViewById(R.id.forgetPassword);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the login activity when the "Sign Up" button is clicked
                Intent HomeIntent = new Intent(Login.this, FeaturedItems.class);
                startActivity(HomeIntent);
            }
        });

        ForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ForgetPasswordIntent = new Intent(Login.this, forgetPassword.class);
                startActivity(ForgetPasswordIntent);
            }
        });
    }
}