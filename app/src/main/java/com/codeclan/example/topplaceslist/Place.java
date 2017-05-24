package com.codeclan.example.topplaceslist;

/**
 * Created by irma on 24/05/2017.
 */

class Place {

    private int ranking;
    private String name;
    private String country;

    public Place(Integer ranking, String name, String country) {
        this.ranking = ranking;
        this.name = name;
        this.country = country;
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
}
