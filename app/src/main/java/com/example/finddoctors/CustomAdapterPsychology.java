package com.example.finddoctors;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapterPsychology extends ArrayAdapter<Psychology> {

    private Activity context;
    private List<Psychology> psychologyList;

    public CustomAdapterPsychology(Activity context,List<Psychology> psychologyList) {
        super(context,R.layout.sample_layout_psychology, psychologyList);
        this.context = context;
        this.psychologyList = psychologyList;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout_psychology,null,true);

        Psychology Psychology = psychologyList.get(position);
        TextView t1 = view.findViewById(R.id.nameTextViewIdp);
        TextView t2 = view.findViewById(R.id.qlTextViewIdp);
        TextView t3 = view.findViewById(R.id.placeTextViewIdp);
        TextView t4 = view.findViewById(R.id.contactTextViewIdp);

        t1.setText("Name: "+Psychology.getName());
        t2.setText("Qualifications: "+Psychology.getQualifications());
        t3.setText("Place: "+Psychology.getPlace());
        t4.setText("Contacts: "+Psychology.getContacts());

        return view;
    }
}
