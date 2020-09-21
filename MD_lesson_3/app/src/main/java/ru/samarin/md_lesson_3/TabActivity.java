package ru.samarin.md_lesson_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import ru.samarin.md_lesson_3.ui.MyTabsAdapter;
import ru.samarin.md_lesson_3.ui.gallery.GalleryFragment;
import ru.samarin.md_lesson_3.ui.home.HomeFragment;
import ru.samarin.md_lesson_3.ui.slideshow.SlideshowFragment;

public class TabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        Fragment fragment1 = HomeFragment.newInstance(null);
        Fragment fragment2 = GalleryFragment.newInstance(null);
        Fragment fragment3 = SlideshowFragment.newInstance(null);

        MyTabsAdapter adapter = new MyTabsAdapter(getSupportFragmentManager());
        adapter.addFragment(fragment1, "Tab 1");
        adapter.addFragment(fragment2, "Tab 2");
        adapter.addFragment(fragment3, "Tab 3");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        TabLayout tabs = findViewById(R.id.tab_layout);
        tabs.setupWithViewPager(viewPager);
    }
}