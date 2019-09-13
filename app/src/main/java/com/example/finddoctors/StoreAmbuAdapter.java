package com.example.finddoctors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StoreAmbuAdapter extends BaseAdapter {

    private Context mContext;
    private List<StoreAmbu> mStoreAmbuList;

    //Constructor

    public StoreAmbuAdapter(Context mContext, List<StoreAmbu> mStoreAmbuList) {
        this.mContext = mContext;
        this.mStoreAmbuList = mStoreAmbuList;
    }

    @Override
    public int getCount() {
        return mStoreAmbuList.size();
    }

    @Override
    public Object getItem(int position) {
        return mStoreAmbuList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext,R.layout.item_store,null);
        TextView ambuName = v.findViewById(R.id.ambu_name);
        TextView ambuPlace = v.findViewById(R.id.place);
        TextView ambuNumber = v.findViewById(R.id.ambu_no);

        ambuName.setText(mStoreAmbuList.get(position).getName());
        ambuPlace.setText(mStoreAmbuList.get(position).getPlace());
        ambuNumber.setText(mStoreAmbuList.get(position).getNumber());

        v.setTag(mStoreAmbuList.get(position).getId());

        return v;

    }
}
