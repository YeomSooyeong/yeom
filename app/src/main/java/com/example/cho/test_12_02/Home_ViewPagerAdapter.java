package com.example.cho.test_12_02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by User on 2016-11-15.
 */



public class Home_ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> home_fragments = new ArrayList<>();
    ArrayList<String> home_tabTitles = new ArrayList<>();

        public void addFragments(Fragment fragments, String titles){
        this.home_fragments.add(fragments);
        this.home_tabTitles.add(titles);
    }

    public Home_ViewPagerAdapter(FragmentManager home_fragment_manager)
    {
        super(home_fragment_manager);
    }

    @Override
    public Fragment getItem(int position) { return home_fragments.get(position); }

    @Override
    public int getCount() {
        return home_fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return home_tabTitles.get(position);
    }




}
