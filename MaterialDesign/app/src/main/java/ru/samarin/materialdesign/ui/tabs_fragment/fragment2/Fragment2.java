package ru.samarin.materialdesign.ui.tabs_fragment.fragment2;

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

public class Fragment2 extends Fragment {

    private ViewModel2 homeViewModel;

    public static Fragment2 newInstance(Bundle bundle) {
        Fragment2 currentFragment = new Fragment2();
        Bundle args = new Bundle();
        args.putBundle("getArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public Fragment2() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(ViewModel2.class);
        View root = inflater.inflate(R.layout.fragment_tabs2, container, false);
        final TextView textView = root.findViewById(R.id.text_fragment2_tabs);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}