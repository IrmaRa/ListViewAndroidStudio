package com.codeclan.example.topplaceslist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        TopPlaces topPlaces = new TopPlaces();
        ArrayList<Place> list = topPlaces.getList();

        TopPlacesAdapter placesAdapter = new TopPlacesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

    }

    public void getPlace(View listItem) {
        Place place = (Place) listItem.getTag();
        Log.d("Place Name: ", place.getName());

    }
}
