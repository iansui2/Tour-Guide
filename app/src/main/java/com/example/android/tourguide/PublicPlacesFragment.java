package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PublicPlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.title_la_mesa_eco_park,
                R.string.desc_la_mesa_eco_park,
                R.string.loc_la_mesa_eco_park,
                R.drawable.la_mesa_eco_park,
                R.string.link_la_mesa_eco_park));
        places.add(new Places(R.string.title_quezon_memorial_circle,
                R.string.desc_quezon_memorial_circle,
                R.string.loc_quezon_memorial_circle,
                R.drawable.quezon_memorial_circle,
                R.string.link_quezon_memorial_circle));
        places.add(new Places(R.string.title_na_parks,
                R.string.desc_na_parks,
                R.string.loc_na_parks,
                R.drawable.ninoy_aquino_parks_and_wildlife_center,
                R.string.link_na_parks));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}