package com.example.android.middletowntour;

public class Tour {

    //A string for the places the app recommends visiting.
    private String tPlacesVisit;

    //A string for the description of places to visit.
    private String tPlacesDescription;

    //Image resource files for the places to visit.
    private int tPlacesImage;

    public Tour(String placesVisit, String placesDescription, int placesImage) {
        tPlacesVisit = placesVisit;
        tPlacesDescription = placesDescription;
        tPlacesImage = placesImage;
    }

    public String getPlacesVisit() {
        return tPlacesVisit;
    }

    public String getPlacesDescription() {
        return tPlacesDescription;
    }

    public int getPlacesImage() {
        return tPlacesImage;
    }
}