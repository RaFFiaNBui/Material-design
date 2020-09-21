package ru.samarin.md_lesson_3.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyTabsAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments = new ArrayList<>();
    private ArrayList<String> tabs = new ArrayList<>();

    public MyTabsAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String tabs) {
        this.fragments.add(fragment);
        this.tabs.add(tabs);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position);
    }
}
