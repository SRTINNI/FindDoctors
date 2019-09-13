package com.example.finddoctors;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ChildSpecialists extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference ref;
    private ListView listView;
    private List<Pediatric> pediatricList;
    private CustomAdapterPediatric customAdapterPediatric;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_specialists);
        getSupportActionBar().setTitle("ChildSpecialists");


        listView = findViewById(R.id.listViewPed);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Pediatrics");
        pediatricList = new ArrayList<>();
        customAdapterPediatric = new CustomAdapterPediatric(ChildSpecialists.this,pediatricList);
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                pediatricList.clear();
                for(DataSnapshot dataSnapshot1 :  dataSnapshot.getChildren()){
                    Pediatric pediatric = dataSnapshot1.getValue(Pediatric.class);
                    pediatricList.add(pediatric);
                }
                listView.setAdapter(customAdapterPediatric);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        super.onStart();

//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               if(position == 0){
//                   String number = "01729615345";
//                   Intent intent = new Intent(Intent.ACTION_CALL);
//                   intent.setData(Uri.parse("tel:"+number));
//                   startActivity(intent);
//               }
//            }
//        });

    }
}
