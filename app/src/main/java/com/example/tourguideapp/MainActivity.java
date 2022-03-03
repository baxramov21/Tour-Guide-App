package com.example.tourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPagerForFragments = findViewById(R.id.viewPagerForFragments);
        FragmentsAdapter adapterForFragmentFragments = new FragmentsAdapter(getSupportFragmentManager());
        viewPagerForFragments.setAdapter(adapterForFragmentFragments);
        TabLayout tabLayoutForFragments = findViewById(R.id.tabLayoutOfFragments);
        tabLayoutForFragments.setupWithViewPager(viewPagerForFragments);
    }
}

