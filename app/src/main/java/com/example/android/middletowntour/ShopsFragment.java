package com.example.android.middletowntour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //An ArrayList that provides information for the restaurant category.
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(getString(R.string.hardesters_name), getString(R.string.hardesters_description), R.drawable.hardesters_image));
        tours.add(new Tour(getString(R.string.bunk_house_name), getString(R.string.bunk_house_description), R.drawable.bunk_house_image));
        tours.add(new Tour(getString(R.string.funtopia_name), getString(R.string.funtopia_description), R.drawable.funtopia_image));
        tours.add(new Tour(getString(R.string.thrift_store_name), getString(R.string.thrift_store_description), R.drawable.thrift_store_image));
        tours.add(new Tour(getString(R.string.women_traders_name), getString(R.string.women_traders_description), R.drawable.women_traders_image));
        tours.add(new Tour(getString(R.string.rosales_market_name), getString(R.string.rosales_market_description), R.drawable.rosales_market_image));
        tours.add(new Tour(getString(R.string.ranch_supply_name), getString(R.string.ranch_supply_description), R.drawable.ranch_supply_image));

        //Creates list items for each item in the list.
        TourAdapter adapter = new TourAdapter(getActivity(), tours);

        //Links to a ListView with the id list.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
