package com.example.android.middletowntour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[]{"Restaurants", "Events", "Shops", "Attractions"};
    private Context context;

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new EventsFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new AttractionsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}

