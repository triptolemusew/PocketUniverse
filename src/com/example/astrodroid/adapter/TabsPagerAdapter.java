package com.example.astrodroid.adapter;


import com.example.astrodroid.Update;
import com.example.astrodroid.HomePage;
import com.example.astrodroid.AboutUs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{
	public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new AboutUs();
        case 1:
            // Games fragment activity
            return new Update();
        case 2:
            // Movies fragment activity
            return new HomePage();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
	
}
