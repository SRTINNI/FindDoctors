package com.example.finddoctors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapterMedi extends ArrayAdapter<Medicine> {

    private Activity context;
    private List<Medicine> medicineList;

    public CustomAdapterMedi(Activity context, List<Medicine> medicineList) {
        super(context, R.layout.sample_layout_medi, medicineList);
        this.context = context;
        this.medicineList = medicineList;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout_medi,null,true);

        Medicine Medicine = medicineList.get(position);
        TextView t1 = view.findViewById(R.id.nameTextViewId);
        TextView t2 = view.findViewById(R.id.qlTextViewId);
        TextView t3 = view.findViewById(R.id.placeTextViewId);
        TextView t4 = view.findViewById(R.id.contactTextViewId);

        t1.setText("Name: "+Medicine.getName());
        t2.setText("Qualifications: "+Medicine.getQualifications());
        t3.setText("Place: "+Medicine.getPlace());
        t4.setText("Contacts: "+Medicine.getContacts());


        return view;
    }
}
