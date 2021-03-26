package com.example.android.tourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.data.Places;
import com.example.android.tourguide.R;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {
    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Places currentPlace = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentPlace.getTitleId());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getDescriptionId());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentPlace.getLocationId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.destinationImage);
        imageView.setImageResource(currentPlace.getImageResourceId());

        TextView sourceTextView = (TextView) listItemView.findViewById(R.id.source);
        sourceTextView.setText(currentPlace.getSourceLinkId());

        return listItemView;
    }
}
