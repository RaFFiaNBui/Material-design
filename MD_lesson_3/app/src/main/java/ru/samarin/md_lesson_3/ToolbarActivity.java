package ru.samarin.md_lesson_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public class ToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.btn_show).setOnClickListener(v -> {
            findViewById(R.id.progress_bar_1).setVisibility(View.VISIBLE);
            findViewById(R.id.progress_bar_2).setVisibility(View.VISIBLE);
        });

        findViewById(R.id.btn_hide).setOnClickListener(v -> {
            findViewById(R.id.progress_bar_1).setVisibility(View.INVISIBLE);
            findViewById(R.id.progress_bar_2).setVisibility(View.INVISIBLE);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                Log.d("Tag", "onOptionsItemSelected: ");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}