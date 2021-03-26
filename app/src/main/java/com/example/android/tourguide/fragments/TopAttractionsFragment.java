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

public class TopAttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        View listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.title_art_in_island, R.string.desc_art_in_island,
                    R.string.loc_art_in_island, R.drawable.art_in_island,
                    R.string.link_art_in_island));
        places.add(new Places(R.string.title_circle_of_fun, R.string.desc_circle_of_fun,
                R.string.loc_circle_of_fun, R.drawable.circle_of_fun,
                R.string.link_circle_of_fun));
        places.add(new Places(R.string.title_ateneo_art_gallery, R.string.desc_ateneo_art_gallery,
                R.string.loc_ateneo_art_gallery, R.drawable.ateneo_art_gallery,
                R.string.link_ateneo_art_gallery));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }
}