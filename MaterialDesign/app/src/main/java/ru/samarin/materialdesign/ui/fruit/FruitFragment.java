package ru.samarin.materialdesign.ui.fruit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ru.samarin.materialdesign.R;
import ru.samarin.materialdesign.ui.MyRecyclerAdapter;

public class FruitFragment extends Fragment {

    private FruitViewModel homeViewModel;
    private static int LAYOUT = R.layout.fragment_fruit;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(FruitViewModel.class);
        View root = inflater.inflate(R.layout.fragment_recycler, container, false);
/*        final TextView textView = root.findViewById(R.id.text_fruit);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        String[] dataText = getResources().getStringArray(R.array.data_text);
        int[] dataPicture = {
                R.drawable.fruit,
                R.drawable.veg,
                R.drawable.nature,
                R.drawable.fruit,
                R.drawable.veg,
                R.drawable.nature,
                R.drawable.fruit,
                R.drawable.veg,
                R.drawable.nature,
        };
        initRecycler(dataText, dataPicture, root);
        return root;
    }

    private void initRecycler(String[] dataText, int[] dataPicture, View root) {
        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(dataText, dataPicture, LAYOUT);
        recyclerView.setAdapter(adapter);
    }
}