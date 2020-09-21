package ru.samarin.materialdesign.ui.vegetables;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ru.samarin.materialdesign.R;
import ru.samarin.materialdesign.ui.MyRecyclerAdapter;
import ru.samarin.materialdesign.ui.MyTabsAdapter;
import ru.samarin.materialdesign.ui.tabs_fragment.fragment1.Fragment1;
import ru.samarin.materialdesign.ui.tabs_fragment.fragment2.Fragment2;
import ru.samarin.materialdesign.ui.tabs_fragment.fragment3.Fragment3;

public class VegetablesFragment extends Fragment {

    private VegetablesViewModel galleryViewModel;
    //private static int LAYOUT = R.layout.fragment_vegetables;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(VegetablesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_veg_tabs, container, false);
/*        final TextView textView = root.findViewById(R.id.text_vegetables);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
/*        String[] dataText = getResources().getStringArray(R.array.data_text);
        int[] dataPicture = {
                R.drawable.nature,
                R.drawable.fruit,
                R.drawable.fruit,
                R.drawable.veg,
                R.drawable.veg,
                R.drawable.nature,
                R.drawable.fruit,
                R.drawable.veg,
                R.drawable.nature,
        };
        initRecycler(dataText, dataPicture, root);*/

        Fragment fragment1 = Fragment1.newInstance(null);
        Fragment fragment2 = Fragment2.newInstance(null);
        Fragment fragment3 = Fragment3.newInstance(null);

        MyTabsAdapter adapter = new MyTabsAdapter(getChildFragmentManager());
        adapter.addFragment(fragment1, "Tab 1");
        adapter.addFragment(fragment2, "Tab 2");
        adapter.addFragment(fragment3, "Tab 3");

        ViewPager viewPager = root.findViewById(R.id.view_pager);
        viewPager.setAdapter(adapter);
        TabLayout tabs = root.findViewById(R.id.tab_layout);
        tabs.setupWithViewPager(viewPager);

        return root;
    }

/*    private void initRecycler(String[] dataText, int[] dataPicture, View root) {
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(dataText, dataPicture, LAYOUT);
        recyclerView.setAdapter(adapter);
    }*/
}