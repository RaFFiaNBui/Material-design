package ru.samarin.md_lesson_3.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import ru.samarin.md_lesson_3.R;
import ru.samarin.md_lesson_3.ui.home.HomeFragment;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public static GalleryFragment newInstance(Bundle bundle) {
        GalleryFragment currentFragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putBundle("getArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public GalleryFragment() {}

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}