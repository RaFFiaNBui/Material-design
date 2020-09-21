package ru.samarin.md_lesson_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import ru.samarin.md_lesson_3.ui.gallery.GalleryFragment;
import ru.samarin.md_lesson_3.ui.home.HomeFragment;
import ru.samarin.md_lesson_3.ui.slideshow.SlideshowFragment;

public class BottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);

        replaceFragment(new HomeFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(myNavItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener myNavItemSelectedListener = (item) -> {
        switch (item.getItemId()) {
            case R.id.nav_home:
                replaceFragment(new HomeFragment());
                return true;
            case R.id.nav_gallery:
                replaceFragment(new GalleryFragment());
                return true;
            case R.id.nav_slideshow:
                replaceFragment(new SlideshowFragment());
                return true;
        }
        return false;
    };

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, fragment)
                .commit();
    }
}