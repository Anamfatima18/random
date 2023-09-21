package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FeaturedItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_featured_items);

        LinearLayout HomeIcon = findViewById(R.id.home);

        HomeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(FeaturedItems.this, FeaturedItems.class);
                startActivity(HomeIntent);
            }
        });

        LinearLayout SearchIcon = findViewById(R.id.SearchIcon);

        SearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SearchIntent = new Intent(FeaturedItems.this, FindExactly.class);
                startActivity(SearchIntent);
            }
        });

        LinearLayout AddIcon = findViewById(R.id.AddButton);

        AddIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AddIntent = new Intent(FeaturedItems.this, ItemUpload.class);
                startActivity(AddIntent);
            }
        });
        LinearLayout ChatIcon = findViewById(R.id.ChatIcon);

        ChatIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ChatIntent = new Intent(FeaturedItems.this, Chats.class);
                startActivity(ChatIntent);
            }
        });
        LinearLayout ProfileIcon = findViewById(R.id.profileicon);

        ProfileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ProfileIntent = new Intent(FeaturedItems.this, Profile.class);
                startActivity(ProfileIntent);
            }
        });
    }
}