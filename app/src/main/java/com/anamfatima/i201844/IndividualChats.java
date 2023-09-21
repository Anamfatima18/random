package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IndividualChats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_chats);
        ImageView backButton = findViewById(R.id.backArrow);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish the current activity to go back to the previous screen
                finish();
            }
        });
        ImageView CallButton = findViewById(R.id.callOption);
        CallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CallIntent = new Intent(IndividualChats.this, AudioCall.class);
                startActivity(CallIntent);
            }
        });
        ImageView VideoCall = findViewById(R.id.callOption);
        VideoCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CallIntent = new Intent(IndividualChats.this, VideoCall.class);
                startActivity(CallIntent);
            }
        });


    }
}