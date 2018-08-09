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
public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //An ArrayList that provides information for the restaurant category.
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.langtry_estate_name), getString(R.string.langtry_estate_description), R.drawable.langtry_estate_image));
        tours.add(new Tour(getString(R.string.spring_name), getString(R.string.spring_description), R.drawable.spring_image));
        tours.add(new Tour(getString(R.string.rls_park_name), getString(R.string.rls_park_description), R.drawable.rls_park_image));
        tours.add(new Tour(getString(R.string.calpine_name), getString(R.string.calpine_description), R.drawable.calpine_image));
        tours.add(new Tour(getString(R.string.art_center_name), getString(R.string.art_center_description), R.drawable.art_center_image));
        tours.add(new Tour(getString(R.string.beaver_creek_name), getString(R.string.beaver_creek_description), R.drawable.beaver_creek_image));
        tours.add(new Tour(getString(R.string.twin_pine_name), getString(R.string.twin_pine_description), R.drawable.twin_pine_image));

        //Creates list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        //Links to a ListView with the id list.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
