package com.example.finddoctors;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FragmentQuiz extends Fragment {

    View view;
    public FragmentQuiz() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.quiz_fragment,container,false);

        final ListView lv = view.findViewById(R.id.listViewQuiz);
        List<QuizDoc> mQuizDocList = new ArrayList<>();

        //Add sample data for list
        //Also we can get data from database here
        mQuizDocList.add(new QuizDoc(1,"Prof.Dr.Mainul Hasan Sadik","Ibn Sina Diagnostic,Bogura","Mob:01991-980546"));
        mQuizDocList.add(new QuizDoc(2,"Dr. Md. Rafiqul Islam","Ibn Sina Diagnostic,Bogura","Mob:01991-980547"));
        mQuizDocList.add(new QuizDoc(3,"Prof.Dr. Khan Abull Kalam Azad","Popular Diagnostic Centre, Bogura","Mob: 01919 610187"));
        mQuizDocList.add(new QuizDoc(4,"Dr. A.K.M. Masudur Rahman","Popular Diagnostic Centre, Bogura","Mob: 01919 610187"));
        mQuizDocList.add(new QuizDoc(5,"Dr. Md. Mamunur Rashid","Popular Diagnostic Centre, Bogura","Mob: 01919 610187"));


        QuizDocAdapter adapter = new QuizDocAdapter(getContext(),mQuizDocList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //write click listener code
               // Toast.makeText(getContext(),"Clicked Product id = "+view.getTag(),Toast.LENGTH_SHORT).show();
                if(position==0){
                    String number = "01991-980546";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==1){
                    String number = "01991-980547";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==2){
                    String number = "01919 610187";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==3){
                    String number = "01919 610187";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==4){
                    String number = "01919 610187";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
            }
        });
        return view;

    }
}


