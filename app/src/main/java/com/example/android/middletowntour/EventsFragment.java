package com.example.android.middletowntour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //An ArrayList that provides information for the restaurant category.
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.middletown_days_name), getString(R.string.middletown_days_description), R.drawable.middletown_days_image));
        tours.add(new Tour(getString(R.string.chili_cookoff_name), getString(R.string.chili_cookoff_description), R.drawable.chili_cookoff_image));
        tours.add(new Tour(getString(R.string.geysers_tour_name), getString(R.string.geysers_tour_description), R.drawable.geyser_tour_image));
        tours.add(new Tour(getString(R.string.wine_tour_name), getString(R.string.wine_tour_description), R.drawable.wine_tour_image));
        tours.add(new Tour(getString(R.string.movie_night_name), getString(R.string.movie_night_description), R.drawable.movie_night_image));
        tours.add(new Tour(getString(R.string.fridays_middletown_name), getString(R.string.fridays_middletown_description), R.drawable.fridays_middletown_image));

        //Creates list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        //Links to a ListView with the id list.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
