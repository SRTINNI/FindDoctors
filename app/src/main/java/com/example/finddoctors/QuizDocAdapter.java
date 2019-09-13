package com.example.finddoctors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class QuizDocAdapter extends BaseAdapter {
    private Context mContext;
    private List<QuizDoc> mQuizeDocList;
    //Constructor

    public QuizDocAdapter(Context mContext, List<QuizDoc> mQuizeDocList) {
        this.mContext = mContext;
        this.mQuizeDocList = mQuizeDocList;
    }

    @Override
    public int getCount() {
        return mQuizeDocList.size();
    }

    @Override
    public Object getItem(int position) {
        return mQuizeDocList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext,R.layout.item_quiz,null);
        TextView docName = v.findViewById(R.id.doc_name);
        TextView docPlace = v.findViewById(R.id.place);
        TextView docNumber = v.findViewById(R.id.doc_no);

        docName.setText(mQuizeDocList.get(position).getName());
        docPlace.setText(mQuizeDocList.get(position).getPlace());
        docNumber.setText(mQuizeDocList.get(position).getNumber());

        v.setTag(mQuizeDocList.get(position).getId());

        return v;
    }
}
