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

public class Neurologists extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    private ListView listView;
    private List<Neurology> neurologyList;
    private CustomAdapterNeuro customAdapterNeuro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neurologists);
        getSupportActionBar().setTitle("Neurologists");

        listView = findViewById(R.id.listViewNeuro);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Neurology");

        neurologyList = new ArrayList<>();
        customAdapterNeuro = new CustomAdapterNeuro(Neurologists.this,neurologyList);

    }

    @Override
    protected void onStart() {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                neurologyList.clear();
                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){

                    Neurology neurology = dataSnapshot1.getValue(Neurology.class);
                    neurologyList.add(neurology);
                }
                listView.setAdapter(customAdapterNeuro);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        super.onStart();
    }
}
