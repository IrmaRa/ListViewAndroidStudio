package com.codeclan.example.topplaceslist;

import android.media.Image;

/**
 * Created by irma on 24/05/2017.
 */

class Place {

    private int ranking;
    private String name;
    private String country;
    private Integer image;

    public Place(Integer ranking, String name, String country, Integer image) {
        this.ranking = ranking;
        this.name = name;
        this.country = country;
        this.image = image;
    }


    public Integer getRanking() {
        return ranking;
    }


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public Integer getImage() {
        return image;
    }
}
