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
public class HotelsFragment extends Fragment {
    private ListView spotsListView;
    private ArrayList<Spot> spotArrayList;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spots_list, container, false);

        spotArrayList = new ArrayList<>();

        spotArrayList.add(new Spot(R.drawable.euroasiahotel,getString(R.string.euro_asia_hotel),getString(R.string.euro_asia_hotel_info)));
        spotArrayList.add(new Spot(R.drawable.malikahotel,getString(R.string.malika_hotel),getString(R.string.malika_hotel_info)));
        spotArrayList.add(new Spot(R.drawable.fayzhotel,getString(R.string.fayz_hotel),getString(R.string.fayz_hotel_info)));
        spotArrayList.add(new Spot(R.drawable.asiakhivahotel,getString(R.string.asia_khiva_hotel),getString(R.string.asia_khiva_hotel_info)));
        spotArrayList.add(new Spot(R.drawable.islombekhotels,getString(R.string.islam_khodzha),getString(R.string.islam_khodzha_info)));

        spotsListView = rootView.findViewById(R.id.spots_list_view);
        SpotAdapter adapterForArrayListOfItems = new SpotAdapter(getActivity(),spotArrayList);
        spotsListView.setAdapter(adapterForArrayListOfItems);
        spotsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Spot currentItem = spotArrayList.get(position);
                Intent intentToOpenMoreInfoAboutSpot = new Intent(getActivity(),SpotDetailActivity.class);
                intentToOpenMoreInfoAboutSpot.putExtra("Spot name",currentItem.getSpotName());
                intentToOpenMoreInfoAboutSpot.putExtra("Spot Declaration",currentItem.getSpotDeclaration());
                intentToOpenMoreInfoAboutSpot.putExtra("image resource ID",currentItem.getSpotImageID());
                startActivity(intentToOpenMoreInfoAboutSpot);
            }
        });
        return rootView;
    }
}