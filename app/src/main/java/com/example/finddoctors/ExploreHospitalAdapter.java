package com.example.finddoctors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ExploreHospitalAdapter extends BaseAdapter {

    private Context mContext;
    private List<ExploreHospital> mExploreHospitalList;

    //Constructor


    public ExploreHospitalAdapter(Context mContext, List<ExploreHospital> mExploreHospitalList) {
        this.mContext = mContext;
        this.mExploreHospitalList = mExploreHospitalList;
    }

    @Override
    public int getCount() {
        return mExploreHospitalList.size();
    }

    @Override
    public Object getItem(int position) {
        return mExploreHospitalList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext,R.layout.item_explore,null);
        TextView hospitalName = v.findViewById(R.id.hospital_name);
        TextView hospitalPlace = v.findViewById(R.id.place);
        TextView hospitalNumber = v.findViewById(R.id.hospital_no);

        hospitalName.setText(mExploreHospitalList.get(position).getName());
        hospitalPlace.setText(mExploreHospitalList.get(position).getPlace());
        hospitalNumber.setText(mExploreHospitalList.get(position).getNumber());

        v.setTag(mExploreHospitalList.get(position).getId());

        return v;
    }
}
