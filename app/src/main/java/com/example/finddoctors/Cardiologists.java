package com.example.finddoctors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Cardiologists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiologists);

        getSupportActionBar().setTitle("Cardiologists");
    }
}
