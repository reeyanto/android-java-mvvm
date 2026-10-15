package com.riyanto.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvData;
    private Button btnCounter;

    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvData = findViewById(R.id.tvData);
        btnCounter = findViewById(R.id.btnCounter);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.getCounter().observe(this, counter -> {
            tvData.setText(String.valueOf(counter));
        });

        btnCounter.setOnClickListener(view -> {
            mainViewModel.increment();
        });
    }
}