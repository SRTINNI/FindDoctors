package com.example.finddoctors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Dentists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentists);

        getSupportActionBar().setTitle("Dentists");
    }
}