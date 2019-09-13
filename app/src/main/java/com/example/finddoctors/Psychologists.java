package com.example.finddoctors;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Psychologists extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    private ListView listView;
    private List<Psychology> psychologyList;
    private CustomAdapterPsychology customAdapterPsychology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychologists);
        getSupportActionBar().setTitle("Psychologists");

        listView = findViewById(R.id.listViewPsychology);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Psychology");

        psychologyList = new ArrayList<>();
        customAdapterPsychology = new CustomAdapterPsychology(Psychologists.this,psychologyList);
    }

    @Override
    protected void onStart() {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                psychologyList.clear();
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){

                    Psychology psychology = dataSnapshot1.getValue(Psychology.class);
                    psychologyList.add(psychology);
                }
                listView.setAdapter(customAdapterPsychology);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        super.onStart();
    }
}

