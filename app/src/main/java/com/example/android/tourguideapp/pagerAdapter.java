package com.example.android.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class pagerAdapter extends FragmentStatePagerAdapter{

    int aNoOfTabs;

    public pagerAdapter(FragmentManager fm, int NumberOfTabs)
    {
        super(fm);
        this.aNoOfTabs = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {

            case 0:
                tab1 tab1 = new tab1();
                return tab1;
            case 1:
                tab2 tab2 = new tab2();
                return tab2;

            case 2:
                tab3 tab3 = new tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return aNoOfTabs;
    }
}