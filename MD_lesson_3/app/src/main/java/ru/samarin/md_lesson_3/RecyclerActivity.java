package ru.samarin.md_lesson_3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ru.samarin.md_lesson_3.ui.MyRecyclerAdapter;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

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
        initRecycler(dataText, dataPicture);
    }

    private void initRecycler(String[] dataText, int[] dataPicture) {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(dataText, dataPicture);
        recyclerView.setAdapter(adapter);
    }
}