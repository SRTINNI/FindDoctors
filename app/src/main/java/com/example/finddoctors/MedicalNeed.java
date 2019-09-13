package com.example.finddoctors;

import android.Manifest;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MedicalNeed extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_need);
        getSupportActionBar().setTitle("Medical Contacts");


        tabLayout = findViewById(R.id.tabLayoutId);
        appBarLayout = findViewById(R.id.appBarId);
        viewPager = findViewById(R.id.viewPagerId);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragment
        adapter.Addfragment(new FragmentQuiz(), "Doctor's contacts");
        adapter.Addfragment(new FragmentExplore(), "Hospital Contacts");
        adapter.Addfragment(new FragmentStore(), "Ambulance");
        //Adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.medical_need_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.menu_home){
            Intent intent = new Intent(MedicalNeed.this,MainActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_help){
            Intent intent = new Intent(MedicalNeed.this,HelpActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_about){
            Intent intent = new Intent(MedicalNeed.this,AboutDeveloper.class);
            startActivity(intent);
        }
        if(id == R.id.menu_Share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Find Doctor App";
            String body = "This will help you to reach doctors easily.com.example.finddoctor";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"share with"));
        }

        return super.onOptionsItemSelected(item);
    }
}
