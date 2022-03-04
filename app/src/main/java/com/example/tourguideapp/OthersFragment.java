package com.example.tourguideapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class OthersFragment extends Fragment {

    public OthersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spots_list, container, false);

        ArrayList<Spot> arrayListForOtherAttractiveSites = new ArrayList<>();
        arrayListForOtherAttractiveSites.add(new Spot(R.drawable.khoji_berdybay, getString(R.string.khoji_berdibay), getString(R.string.khoji_berdibay_info)));
        arrayListForOtherAttractiveSites.add(new Spot(R.drawable.khorezm_stadium, getString(R.string.khorezm_club_arena), getString(R.string.khorezm_club_arena_info)));
        arrayListForOtherAttractiveSites.add(new Spot(R.drawable.nurullabay_palace, getString(R.string.nurullabay_palace), getString(R.string.nurullabay_palace_info)));
        arrayListForOtherAttractiveSites.add(new Spot(R.drawable.museum_of_al_horezmi, getString(R.string.museum_of_al_horezmi), getString(R.string.museum_of_al_horezmi_info)));
        arrayListForOtherAttractiveSites.add(new Spot(R.drawable.kibla_tozabog, getString(R.string.kibla_tozabog), getString(R.string.kibla_tozabog_info)));

        ListView listOfOtherAttractions = rootView.findViewById(R.id.spots_list_view);
        SpotAdapter adapterForListOfOtherAttractions = new SpotAdapter(getActivity(), arrayListForOtherAttractiveSites);
        listOfOtherAttractions.setAdapter(adapterForListOfOtherAttractions);

        listOfOtherAttractions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Spot currentSpot = arrayListForOtherAttractiveSites.get(position);

                Intent intentToOpenSpotDetailActivity = new Intent(getActivity(), SpotDetailActivity.class);
                String spotName = currentSpot.getSpotName();
                String spotInfo = currentSpot.getSpotDeclaration();
                int spotImageID = currentSpot.getSpotImageID();
                intentToOpenSpotDetailActivity.putExtra("Spot name", spotName);
                intentToOpenSpotDetailActivity.putExtra("Spot Declaration", spotInfo);
                intentToOpenSpotDetailActivity.putExtra("image resource ID", spotImageID);
                startActivity(intentToOpenSpotDetailActivity);
            }
        });
        return rootView;
    }
}