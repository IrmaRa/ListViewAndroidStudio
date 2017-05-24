package com.codeclan.example.topplaceslist;

import java.util.ArrayList;

/**
 * Created by irma on 24/05/2017.
 */

class TopPlaces {

    private ArrayList<Place> list;

    public TopPlaces() {
        list = new ArrayList<Place>();
        list.add(new Place(1, "Kauai", "Hawaii", R.drawable.img_1));
        list.add(new Place(2, "Bora Bora", "French Polynesia", R.drawable.img_2));
        list.add(new Place(3, "Longsheng rice terrace fields", "China", R.drawable.img_3));
        list.add(new Place(4, "Victoria Falls", "Zimbabwe", R.drawable.img_4));
        list.add(new Place(5, "Amazon River", "Brazil", R.drawable.img_5));
        list.add(new Place(6, "Rainbow Mountains", "China", R.drawable.img_6));
        list.add(new Place(7, "Railay", "Thailand", R.drawable.img_7));
        list.add(new Place(8, "Neuschwanstein Castle", "Germany", R.drawable.img_8));
        list.add(new Place(9, "Northern Lights", "Iceland", R.drawable.img_9));
        list.add(new Place(10, "Yellowstone National Park", "Wyoming", R.drawable.img_10));
        list.add(new Place(11, "Tracy Arm Fjord", "Alaska", R.drawable.img_11));
        list.add(new Place(12, "Torres Del Paine Patagonia", "Chile", R.drawable.img_12));
        list.add(new Place(13, "Svalbard", "Norway", R.drawable.img_13));
        list.add(new Place(14, "Temples of Bagan", "Burma", R.drawable.img_14));
        list.add(new Place(15, "Petra", "Jordan", R.drawable.img_15));
        list.add(new Place(16, "Machu Picchu", "Peru", R.drawable.img_16));
        list.add(new Place(17, "Venice", "Italy", R.drawable.img_17));
        list.add(new Place(18, "Giza Pyramids", "Egypt", R.drawable.img_18));
        list.add(new Place(19, "Ta Prohm", "Cambodia", R.drawable.img_19));
        list.add(new Place(20, "Taj Mahal", "India", R.drawable.img_20));

    }


    public ArrayList<Place> getList() {
        return new ArrayList<Place>(list);

    }
}
