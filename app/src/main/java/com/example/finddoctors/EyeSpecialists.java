package com.example.finddoctors;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class EyeSpecialists extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    private ListView listView;
    private List<Eye> eyeList;
    private CustomAdapterEye customAdapterEye;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_specialists);
        getSupportActionBar().setTitle("Eye Specialists");

        listView = findViewById(R.id.listViewEye);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Eyes");

        eyeList = new ArrayList<>();
        customAdapterEye = new CustomAdapterEye(EyeSpecialists.this,eyeList);

    }


    @Override
    protected void onStart() {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                eyeList.clear();
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){

                    Eye eye = dataSnapshot1.getValue(Eye.class);
                    eyeList.add(eye);
                }
                listView.setAdapter(customAdapterEye);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        super.onStart();
    }
}
