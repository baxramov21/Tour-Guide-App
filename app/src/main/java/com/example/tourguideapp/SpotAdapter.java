package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SpotAdapter extends ArrayAdapter<Spot> {

    public SpotAdapter(@NonNull Context context,@NonNull ArrayList<Spot> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView = convertView;
       if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.spot_item, parent, false);
        }
       Spot spotItem = getItem(position);

        TextView textViewForNameOfSpot = listItemView.findViewById(R.id.textViewSpotName);
        textViewForNameOfSpot.setText(spotItem.getSpotName());

        ImageView spotImageID = listItemView.findViewById(R.id.imageViewSpotImage);
        spotImageID.setImageResource(spotItem.getSpotImageID());

        return listItemView;
    }
}
