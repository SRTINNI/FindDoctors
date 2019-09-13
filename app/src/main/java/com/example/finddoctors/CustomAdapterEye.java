package com.example.finddoctors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapterEye extends ArrayAdapter<Eye> {
    private Activity context;
    private List<Eye> eyeList;

    public CustomAdapterEye(Activity context, List<Eye> eyeList) {
        super(context, R.layout.sample_layout_eye, eyeList);
        this.context = context;
        this.eyeList = eyeList;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();

        View view = layoutInflater.inflate(R.layout.sample_layout_eye,null,true);

        Eye Eye = eyeList.get(position);
        TextView t1 = view.findViewById(R.id.nameTextViewIde);
        TextView t2 = view.findViewById(R.id.qlTextViewIde);
        TextView t3 = view.findViewById(R.id.placeTextViewIde);
        TextView t4 = view.findViewById(R.id.contactTextViewIde);


        t1.setText("Name: "+Eye.getName());
        t2.setText("Qualifications: "+Eye.getQualifications());
        t3.setText("Place: "+Eye.getPlace());
        t4.setText("Contacts: "+Eye.getContacts());

        return view;
    }
}

