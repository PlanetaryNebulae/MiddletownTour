package com.example.android.middletowntour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {

    //A custom adapter to list the place information.
    public TourAdapter(Activity context, ArrayList<Tour> tours) {
        super(context, 0, tours);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Tour currentTour = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_tour, parent, false);
        }

        //Finds the ImageView for the image of the place to visit.
        ImageView placesImageView = (ImageView) listItemView.findViewById(R.id.place_image);

        //Finds the TextView for the name of the place to visit.
        TextView placesVisitTextView = (TextView) listItemView.findViewById(R.id.place_visit);

        //Finds the TextView for the description of the place to visit.
        TextView placesDescriptionTextView = (TextView) listItemView.findViewById(R.id.place_description);

        //Gets the image of the place to visit and sets it on the ImageView.
        placesImageView.setImageResource(currentTour.getPlacesImage());

        //Gets the text for the place and sets it on the TextView.
        placesVisitTextView.setText(currentTour.getPlacesVisit());

        //Gets the text for the description and sets it on the TextView.
        placesDescriptionTextView.setText(currentTour.getPlacesDescription());

        return listItemView;
    }
}
