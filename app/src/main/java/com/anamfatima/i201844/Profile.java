package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        LinearLayout HomeIcon = findViewById(R.id.homeicon);

        HomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(Profile.this, FeaturedItems.class);
                startActivity(HomeIntent);
            }
        });
        ImageView EditIcon = findViewById(R.id.editicon);

        EditIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent EditIntent = new Intent(Profile.this, EditProfile.class);
                startActivity(EditIntent);
            }
        });

        LinearLayout SearchIcon = findViewById(R.id.SearchIcon);

        SearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SearchIntent = new Intent(Profile.this, FindExactly.class);
                startActivity(SearchIntent);
            }
        });

        LinearLayout AddIcon = findViewById(R.id.AddButton);

        AddIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AddIntent = new Intent(Profile.this, ItemUpload.class);
                startActivity(AddIntent);
            }
        });
        LinearLayout ChatIcon = findViewById(R.id.ChatIcon);

        ChatIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ChatIntent = new Intent(Profile.this, Chats.class);
                startActivity(ChatIntent);
            }
        });
        LinearLayout ProfileIcon = findViewById(R.id.profileicon);

        ProfileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProfileIntent = new Intent(Profile.this, Profile.class);
                startActivity(ProfileIntent);
            }
        });
    }
}