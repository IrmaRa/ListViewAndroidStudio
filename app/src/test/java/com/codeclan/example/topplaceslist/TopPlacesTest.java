package com.codeclan.example.topplaceslist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by irma on 24/05/2017.
 */

public class TopPlacesTest {

    @Test
    public void getListTest() {
        TopPlaces topPlaces = new TopPlaces();
        assertEquals(20, topPlaces.getList().size());
    }
}
