package com.example.android.tourguide.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.PlacesAdapter;
import com.example.android.tourguide.data.Places;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.title_manam, R.string.desc_manam,
                R.string.loc_manam, R.drawable.crisostomo,
                R.string.link_crisostomo));
        places.add(new Places(R.string.title_kuya_j, R.string.desc_kuya_j,
                R.string.loc_kuya_j, R.drawable.kuya_j,
                R.string.link_kuya_j));
        places.add(new Places(R.string.title_maxs_restaurant, R.string.desc_maxs_restaurant,
                R.string.loc_maxs_restaurant, R.drawable.maxs_restaurant,
                R.string.link_maxs_restaurant));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}