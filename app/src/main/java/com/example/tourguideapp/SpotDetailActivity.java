package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SpotDetailActivity extends AppCompatActivity {
    private ImageView imageViewImageOfSpot;
    private TextView textViewSpotName;
    private TextView textViewSpotDeclaration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_detail);

        Intent intentFromFragments = getIntent();
        String spotName =  intentFromFragments.getStringExtra("Spot name");
        String spotDeclaration = intentFromFragments.getStringExtra("Spot Declaration");
        int spotImageID = intentFromFragments.getIntExtra("image resource ID",-1);

        imageViewImageOfSpot = findViewById(R.id.imageViewSpotImageResource);
        imageViewImageOfSpot.setImageResource(spotImageID);
        textViewSpotName = findViewById(R.id.textViewSpotNameForMoreInfo);
        textViewSpotName.setText(spotName);
        textViewSpotDeclaration = findViewById(R.id.textViewSpotDeclaration);
        textViewSpotDeclaration.setText(spotDeclaration);
    }
}