package com.example.android.tourguide;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new MallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Restaurants";
        } else if (position == 1) {
            return "History";
        } else if (position == 2) {
            return "Parks";
        } else {
            return "Malls";
        }
    }
    
}
