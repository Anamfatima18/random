package com.anamfatima.i201844;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Rentit extends AppCompatActivity {
    private ImageView imageSlider;
    private TextView imageSliderText;
    private int[] images = {R.drawable.profile, R.drawable.profile, R.drawable.profile};
    private int currentImageIndex = 0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSlider = findViewById(R.id.image_slider);
        imageSliderText = findViewById(R.id.image_slider_text);
        imageSlider.setImageResource(images[currentImageIndex]);
        imageSliderText.setText("Image " + (currentImageIndex + 1));
        imageSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImageIndex++;
                if (currentImageIndex >= images.length) {
                    currentImageIndex = 0;
                }
                imageSlider.setImageResource(images[currentImageIndex]);
                imageSliderText.setText("Image " + (currentImageIndex + 1));
            }
        });
    }
}