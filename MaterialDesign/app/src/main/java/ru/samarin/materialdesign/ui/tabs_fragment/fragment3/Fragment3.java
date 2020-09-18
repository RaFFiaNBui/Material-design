package ru.samarin.materialdesign.ui.tabs_fragment.fragment3;

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

public class Fragment3 extends Fragment {

    private ViewModel3 slideshowViewModel;

    public static Fragment3 newInstance(Bundle bundle) {
        Fragment3 currentFragment = new Fragment3();
        Bundle args = new Bundle();
        args.putBundle("getArgs", bundle);
        currentFragment.setArguments(args);
        return currentFragment;
    }

    public Fragment3() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(ViewModel3.class);
        View root = inflater.inflate(R.layout.fragment_tabs3, container, false);
        final TextView textView = root.findViewById(R.id.text_fragment3_tabs);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}