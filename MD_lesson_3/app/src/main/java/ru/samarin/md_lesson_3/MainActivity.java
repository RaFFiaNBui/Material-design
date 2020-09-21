package ru.samarin.md_lesson_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"flat button no border", Toast.LENGTH_SHORT).show());

        findViewById(R.id.button_2).setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"flat button with border", Toast.LENGTH_SHORT).show());

        findViewById(R.id.button_3).setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"raised button", Toast.LENGTH_SHORT).show());

        findViewById(R.id.button_4).setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"raised button with background", Toast.LENGTH_SHORT).show());

        findViewById(R.id.fab).setOnClickListener(v ->
                Toast.makeText(MainActivity.this,"float action button", Toast.LENGTH_SHORT).show());
    }
}