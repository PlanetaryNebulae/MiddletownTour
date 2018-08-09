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
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //An ArrayList that provides information for the restaurant category.
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.la_parrilla_name), getString(R.string.la_parrilla_description), R.drawable.la_parrilla_image));
        tours.add(new Tour(getString(R.string.helena_brewery_name), getString(R.string.helena_brewery_description), R.drawable.helena_brewery_image));
        tours.add(new Tour(getString(R.string.twin_pine_name), getString(R.string.twin_pine_restaurant_description), R.drawable.twin_pine_image));
        tours.add(new Tour(getString(R.string.beulahs_name), getString(R.string.beulahs_description), R.drawable.beulahs_image));
        tours.add(new Tour(getString(R.string.cowpoke_name), getString(R.string.cowpoke_description), R.drawable.cowpoke_image));
        tours.add(new Tour(getString(R.string.jolly_kone_name), getString(R.string.jolly_kone_description), R.drawable.jolly_kone_image));
        tours.add(new Tour(getString(R.string.rosales_market_name), getString(R.string.rosales_market_description), R.drawable.rosales_market_image));
        tours.add(new Tour(getString(R.string.senior_center_name), getString(R.string.senior_center_description), R.drawable.senior_center_image));

        //Creates list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        //Links to a ListView with the id list.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
