package com.codeclan.example.topplaceslist;

import java.util.ArrayList;

/**
 * Created by irma on 24/05/2017.
 */

class TopPlaces {

    private ArrayList<Place> list;

    public TopPlaces() {
        list = new ArrayList<Place>();
        list.add(new Place(1, "Kauai", "Hawaii"));
        list.add(new Place(2, "Bora Bora", "French Polynesia"));
        list.add(new Place(3, "Longsheng rice terrace fields", "China"));
        list.add(new Place(4, "Victoria Falls", "Zimbabwe"));
        list.add(new Place(5, "Amazon River", "Brazil"));
        list.add(new Place(6, "Rainbow Mountains", "China"));
        list.add(new Place(7, "Railay", "Thailand"));
        list.add(new Place(8, "Neuschwanstein Castle", "Germany"));
        list.add(new Place(9, "Northern Lights", "Iceland"));
        list.add(new Place(10, "Yellowstone National Park", "Wyoming"));
        list.add(new Place(11, "Tracy Arm Fjord", "Alaska"));
        list.add(new Place(12, "Torres Del Paine Patagonia", "Chile"));
        list.add(new Place(13, "Svalbard", "Norway"));
        list.add(new Place(14, "Temples of Bagan", "Burma"));
        list.add(new Place(15, "Petra", "Jordan"));
        list.add(new Place(16, "Machu Picchu", "Peru"));
        list.add(new Place(17, "Venice", "Italy"));
        list.add(new Place(18, "Giza Pyramids", "Egypt"));
        list.add(new Place(19, "Ta Prohm", "Cambodia"));
        list.add(new Place(20, "Taj Mahal", "India"));

    }


    public ArrayList<Place> getList() {
        return new ArrayList<Place>(list);
    }
}
