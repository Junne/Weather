package com.github.junne.weather.modules.main.adapter;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baijunfeng on 2017/12/5.
 */

public class HomePagerAdapter extends FragmentPagerAdapter {


    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();



    public HomePagerAdapter(FragmentManager fm) { super(fm);}

    public HomePagerAdapter(FragmentManager fm, TabLayout tabLayout) { super(fm); }


    @Override
    public Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
