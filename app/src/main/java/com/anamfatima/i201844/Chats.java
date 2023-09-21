package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);
        LinearLayout HomeIcon = findViewById(R.id.home);

        HomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(Chats.this, FeaturedItems.class);
                startActivity(HomeIntent);
            }
        });

        LinearLayout SearchIcon = findViewById(R.id.SearchIcon);

        SearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SearchIntent = new Intent(Chats.this, FindExactly.class);
                startActivity(SearchIntent);
            }
        });

        LinearLayout AddIcon = findViewById(R.id.AddButton);

        AddIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AddIntent = new Intent(Chats.this, ItemUpload.class);
                startActivity(AddIntent);
            }
        });
        LinearLayout ChatIcon = findViewById(R.id.ChatIcon);

        ChatIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ChatIntent = new Intent(Chats.this, Chats.class);
                startActivity(ChatIntent);
            }
        });
        LinearLayout ProfileIcon = findViewById(R.id.profileicon);

        ProfileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProfileIntent = new Intent(Chats.this, Profile.class);
                startActivity(ProfileIntent);
            }
        });
        ImageView ForwardIcon = findViewById(R.id.forward);

        ForwardIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProfileIntent = new Intent(Chats.this, IndividualChats.class);
                startActivity(ProfileIntent);
            }
        });

    }
}