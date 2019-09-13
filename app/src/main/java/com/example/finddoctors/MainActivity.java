package com.example.finddoctors;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button,buttonMedi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button =  findViewById(R.id.doctor);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDoctorsDpt();
            }
        });

        buttonMedi =  findViewById(R.id.medical);
        buttonMedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMedicalNeeds();
            }
        });
    }
    public void openDoctorsDpt()
    {
        Intent intent = new Intent(MainActivity.this,SplashSreen.class);
        startActivity(intent);
    }

    public void openMedicalNeeds()
    {
        Intent intent = new Intent(MainActivity.this,MedicalNeed.class);
        startActivity(intent);
    }
}
