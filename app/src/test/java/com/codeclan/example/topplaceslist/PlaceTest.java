package com.codeclan.example.topplaceslist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by irma on 24/05/2017.
 */

public class PlaceTest {

    Place place;

    @Before
    public void before() {
        place = new Place(1, "Kauai", "Hawaii");
    }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)1, place.getRanking());

    }

    @Test
    public void getPlaceNameTest() {
        assertEquals("Kauai", place.getName());

    }

    @Test
    public void getCountryTest() {
        assertEquals("Hawaii", place.getCountry());

    }
}
