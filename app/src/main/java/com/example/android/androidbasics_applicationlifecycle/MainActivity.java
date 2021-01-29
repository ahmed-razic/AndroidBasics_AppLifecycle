package com.example.android.androidbasics_applicationlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Main", "App started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Main", "App resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Main", "App paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Main", "App stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Main", "App destroyed");
    }
}