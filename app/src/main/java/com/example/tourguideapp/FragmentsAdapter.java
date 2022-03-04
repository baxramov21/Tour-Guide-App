package com.example.tourguideapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0) {
            return new AttractiveSitesFragment();
        } else if(position == 1) {
            return new HotelsFragment();
        } else if(position == 2) {
            return new RestaurantsFragment();
        } else {
            return new OthersFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
      if(position == 0) {
          return "Attractions";
      } else if(position == 1) {
          return "Hotels";
      } else if(position == 2) {
          return "Restaurants";
      } else {
          return "Other Places";
      }
    }
}
