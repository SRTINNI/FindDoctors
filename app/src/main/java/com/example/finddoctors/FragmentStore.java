package com.example.finddoctors;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FragmentStore extends Fragment {

    View view;

    public FragmentStore() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.store_fragment,container,false);


        ListView lv = view.findViewById(R.id.listViewStore);
        List<StoreAmbu> mStoreAmbuList = new ArrayList<>();

        //Add sample data for list
        //Also we can get data from database here

         mStoreAmbuList.add(new StoreAmbu(1,"Apollo Information Centre","Kanusgari, Sherpur Road, Bogura.","01713-229988"));
         mStoreAmbuList.add(new StoreAmbu(2,"RMC","Rajshahi","4876546"));
        mStoreAmbuList.add(new StoreAmbu(3,"SMC","Dhaka","895420356"));
         mStoreAmbuList.add(new StoreAmbu(4,"DMC","Dhaka","4785410"));
         mStoreAmbuList.add(new StoreAmbu(5,"DjMC","Dinajpur","458444415"));

        StoreAmbuAdapter adapter = new StoreAmbuAdapter(getContext(),mStoreAmbuList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //write click listener code
               // Toast.makeText(getContext(),"Clicked Product id = "+view.getTag(),Toast.LENGTH_SHORT).show();

              if(position==0){
                    String number = "01713-229988";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
               else if(position==1){
                    String number = "01729615345";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}
