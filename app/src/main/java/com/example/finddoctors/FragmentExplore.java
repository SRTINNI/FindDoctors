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

public class FragmentExplore extends Fragment {
    View view;
    public FragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.explore_fragment,container,false);

        ListView lv = view.findViewById(R.id.listViewExplore);
        List<ExploreHospital> mExploreHospitalList = new ArrayList<>();
        //Add sample data for list
        //Also we can get data from database here

        mExploreHospitalList.add(new ExploreHospital(1,"SZMC & Hospital","Selimpur, Bogura","Tel: 051-69005"));
        mExploreHospitalList.add(new ExploreHospital(2,"Samsunnahar Clinic","Thontonia, Bogura","Tel: 051-64860"));
        mExploreHospitalList.add(new ExploreHospital(3,"Sharmin Clinic","SP Ghat, Nataipara, Bogura","Mob: 01716-061597"));
        mExploreHospitalList.add(new ExploreHospital(4,"Doctors Clinic Unit-1","Mofiz Paglar More, Sherpur Road, Bogura","Mob: 017118090501"));
        mExploreHospitalList.add(new ExploreHospital(5,"Annesha Clinic","Sherpur Road, Bogura","Tel: 051-60709"));
        mExploreHospitalList.add(new ExploreHospital(6,"Sandhani","SZMC (Unit Bogura), Bogura","Tel: 0644-5100295"));
        mExploreHospitalList.add(new ExploreHospital(7,"Popular Diagnostic Centre Ltd","Thontonia, Sherpur Road, Bogura","Tel: 051-69500-4"));
        mExploreHospitalList.add(new ExploreHospital(8,"District Hospital","Govt.Hospital & Clinic, Bogura Sadar, Bogura","Mob: 01730-324803"));
        mExploreHospitalList.add(new ExploreHospital(9,"Shanta Clinic","Thanthania, Bogura","Mob: 01711-123947"));
        mExploreHospitalList.add(new ExploreHospital(10,"Al-Madina Clinic","Sherpur Road, Kanusgari, Bogura","Mob: 01734141407"));
        mExploreHospitalList.add(new ExploreHospital(11,"Muhammad Ali Hospital","Sherpur Road,Bus Stop,Bogura","Mob: 01711-703061"));
        mExploreHospitalList.add(new ExploreHospital(12,"Doctors Clinic Unit-2","Thontonia Bus Stand, Bogura","Tel: 0-051- 66224"));
        mExploreHospitalList.add(new ExploreHospital(13,"Sonali General Haspatal","Sherpur Road, Bogura","Mob: 01733-456348"));
        mExploreHospitalList.add(new ExploreHospital(14,"Asia Diagnostic Centre","Bogura city bypass","Tel: Not Available"));
        mExploreHospitalList.add(new ExploreHospital(15,"Labaid Limited (Diagnostic)","Sherpur Road, Bogura","Mob: 01766-660358"));
        mExploreHospitalList.add(new ExploreHospital(16,"Sheba Diagnostic Center","Silimpur, Bogura","Mob: 01761-704353"));
        mExploreHospitalList.add(new ExploreHospital(17,"Delta Diagnostic","Jaleswaritola, Bogura","Mob: 01711-407305"));
        mExploreHospitalList.add(new ExploreHospital(18,"Nazma General Hospital","Khandar, Bogura","Mob: 01718-881340"));
        mExploreHospitalList.add(new ExploreHospital(19,"RCH,TMSS Medical College","Rangpur road, Bogura","Tel: 051-78975"));
        mExploreHospitalList.add(new ExploreHospital(20,"Square Clinic","Kanusgari, Bogura","Mob: 01753 967950"));
        mExploreHospitalList.add(new ExploreHospital(21,"Grameen GC Eye Care Hospital","Betgari, Banani, Bogura","Tel: 051-78898"));
        mExploreHospitalList.add(new ExploreHospital(22,"United General Hospital","Sherpur Road, Bogura","Tel: 051-65420"));




        ExploreHospitalAdapter adapter = new ExploreHospitalAdapter(getContext(),mExploreHospitalList);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //write click listener code
               // Toast.makeText(getContext(),"Clicked Product id = "+view.getTag(),Toast.LENGTH_SHORT).show();

                if(position==0){
                    String number = "051-69005";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==1){
                    String number = "051-64860";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==2){
                    String number = "01716-061597";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==3){
                    String number = "017118090501";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==4){
                    String number = "051-60709";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==5){
                    String number = "0644-5100295";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==6){
                    String number = "051-69500-4";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==7){
                    String number = "01730-324803";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==8){
                    String number = "01711-123947";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==9){
                    String number = "01734141407";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==10){
                    String number = "01711-703061";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==11){
                    String number = " 0-051- 66224";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==12){
                    String number = "01733-456348";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==14){
                    String number = "01766-660358";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==15){
                    String number = "01761-704353";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==16){
                    String number = "01711-407305";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==17){
                    String number = "01718-881340";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==18){
                    String number = "051-78975";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==19){
                    String number = "01753 967950";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==20){
                    String number = "051-78898";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }
                else if(position==21){
                    String number = "051-65420";
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" +number));
                    startActivity(intent);
                }

        }
    });
        return view;

}
}

