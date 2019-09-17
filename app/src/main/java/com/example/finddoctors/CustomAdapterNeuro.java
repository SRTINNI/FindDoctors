package com.example.finddoctors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapterNeuro extends ArrayAdapter<Neurology> {

    private Activity context;
    private List<Neurology> neurologyList;

    public CustomAdapterNeuro(Activity context, List<Neurology> neurologyList) {
        super(context, R.layout.sample_layout_neuro, neurologyList);
        this.context = context;
        this.neurologyList = neurologyList;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout_neuro,null,true);

       Neurology Neurology = neurologyList.get(position);
        TextView t1 = view.findViewById(R.id.nameTextViewId);
        TextView t2 = view.findViewById(R.id.qlTextViewId);
        TextView t3 = view.findViewById(R.id.placeTextViewId);
        TextView t4 = view.findViewById(R.id.contactTextViewId);

        t1.setText("Name: "+Neurology.getName());
        t2.setText("Qualifications: "+Neurology.getQualifications());
        t3.setText("Place: "+Neurology.getPlace());
        t4.setText("Contacts: "+Neurology.getContacts());


        return view;
    }
}
