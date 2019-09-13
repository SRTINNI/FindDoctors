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

public class MedicineSpecialists extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    private ListView listView;
    private List<Medicine> medicineList;
    private CustomAdapterMedi customAdapterMedi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_specialists);
        getSupportActionBar().setTitle("MedicineSpecialists");

        listView = findViewById(R.id.listViewMedi);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Medicines");

        medicineList = new ArrayList<>();
        customAdapterMedi = new CustomAdapterMedi(MedicineSpecialists.this,medicineList);

    }

    @Override
    protected void onStart() {
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                medicineList.clear();
                for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){

                    Medicine medicine = dataSnapshot1.getValue(Medicine.class);
                    medicineList.add(medicine);
                }

                listView.setAdapter(customAdapterMedi);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        super.onStart();
    }
}
