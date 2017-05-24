package com.codeclan.example.topplaceslist;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by irma on 24/05/2017.
 */

class TopPlacesAdapter extends ArrayAdapter<Place> {

    public TopPlacesAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.places_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentPlace.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentPlace.getName());

        TextView country = (TextView) listItemView.findViewById(R.id.country);
        country.setText(currentPlace.getCountry());

        listItemView.setTag(currentPlace);

        return listItemView;

    }
}
