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
public class AttractiveSitesFragment extends Fragment {

    private ListView spotsListView;
    private ArrayList<Spot> spotArrayList;

    public AttractiveSitesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.spots_list, container, false);

        spotArrayList = new ArrayList<>();

        spotArrayList.add(new Spot(R.drawable.the_islam_khodzha_ensemble, getString(R.string.islam_khodzha),getString(R.string.islam_khodzha_info)));
        spotArrayList.add(new Spot(R.drawable.kalta_minor, getString(R.string.kalta_minor), getString(R.string.kalta_minor_info)));
        spotArrayList.add(new Spot(R.drawable.kunya_ark_citadel, getString(R.string.kunya_ark), getString(R.string.kunya_ark_info)));
        spotArrayList.add(new Spot(R.drawable.pakhlavan_mahmud_mausoleum, getString(R.string.pahlavan_mahmud), getString(R.string.pahlavan_mahmud_info)));
        spotArrayList.add(new Spot(R.drawable.mohamed_rakhimkhan, getString(R.string.mohamed_rahim_khan), getString(R.string.mohamed_rahim_khan_info)));
        spotArrayList.add(new Spot(R.drawable.murad_inak_madrasah, getString(R.string.murad_inak), getString(R.string.murad_inak_info)));
        spotArrayList.add(new Spot(R.drawable.juma_mosque, getString(R.string.juma_mosque), getString(R.string.juma_mosque_info)));
        spotArrayList.add(new Spot(R.drawable.palvan_darvaza, getString(R.string.palvan_darvaza), getString(R.string.palvan_darvaza_info)));

        spotsListView = rootView.findViewById(R.id.spots_list_view);
        SpotAdapter adapterForArrayListOfItems = new SpotAdapter(getActivity(), spotArrayList);
        spotsListView.setAdapter(adapterForArrayListOfItems);
        spotsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Spot currentItem = spotArrayList.get(position);
                Intent intentToOpenMoreInfoAboutSpot = new Intent(getActivity(), SpotDetailActivity.class);
                intentToOpenMoreInfoAboutSpot.putExtra(getString(R.string.spot_name_for_detail_activity), currentItem.getSpotName());
                intentToOpenMoreInfoAboutSpot.putExtra(getString(R.string.spot_info_for_detail_activity), currentItem.getSpotDeclaration());
                intentToOpenMoreInfoAboutSpot.putExtra(getString(R.string.string_for_spot_image_resource), currentItem.getSpotImageID());
                startActivity(intentToOpenMoreInfoAboutSpot);
            }
        });
        return rootView;
    }
}