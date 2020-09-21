package ru.samarin.materialdesign.ui.tabs_fragment.fragment1;

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

import ru.samarin.materialdesign.R;


public class Fragment1 extends Fragment {

    private ViewModel1 galleryViewModel;

    public static Fragment1 newInstance(Bundle bundle) {
        Fragment1 currentFragment = new Fragment1();
        Bundle args = new Bundle();
        args.putBundle("getArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public Fragment1() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(ViewModel1.class);
        View root = inflater.inflate(R.layout.fragment_tabs1, container, false);
        final TextView textView = root.findViewById(R.id.text_fragment1_tabs);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(R.string.large_text);
                //textView.setText(s);
            }
        });
        return root;
    }
}