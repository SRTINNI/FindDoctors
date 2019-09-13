package com.example.finddoctors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapterPediatric extends ArrayAdapter<Pediatric> {
    private Activity context;
    private List<Pediatric> pediatricList;

    public CustomAdapterPediatric(Activity context, List<Pediatric> pediatricList) {
        super(context, R.layout.sample_layout_pedi, pediatricList);
        this.context = context;
        this.pediatricList = pediatricList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout_pedi,null,true);

        Pediatric Pediatric = pediatricList.get(position);
        TextView t1 = view.findViewById(R.id.nameTextViewIdPed);
        TextView t2 = view.findViewById(R.id.qlTextViewIdPed);
        TextView t3 = view.findViewById(R.id.placeTextViewIdPed);
        TextView t4 = view.findViewById(R.id.contactTextViewIdPed);

        t1.setText("Name: "+Pediatric.getName());
        t2.setText("Qualifications: "+Pediatric.getQualifications());
        t3.setText("Place: "+Pediatric.getPlace());
        t4.setText("Contacts: "+Pediatric.getContacts());

        return view;
    }
}
