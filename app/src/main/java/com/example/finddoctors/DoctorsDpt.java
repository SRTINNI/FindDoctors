package com.example.finddoctors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class DoctorsDpt extends AppCompatActivity implements View.OnClickListener{

    private CardView pediatric,medicine,eye,psychology,neurology,cardiology,spinal,gynecology,diabetes,dental,urology,gastro,orthopedic;
    private  CardView otolar,nephrology,paralysis,skin,laparo,microbio,radio,sono,surgon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_dpt);
        getSupportActionBar().setTitle("Doctor's Departments");


        //defining cards
        pediatric =  findViewById(R.id.ped);
        medicine = findViewById(R.id.medi);
        eye = findViewById(R.id.eye);
        psychology = findViewById(R.id.psycho);
        neurology = findViewById(R.id.neuro);
        cardiology = findViewById(R.id.cardio);
        spinal = findViewById(R.id.spinal);
        gynecology = findViewById(R.id.gyne);
        diabetes = findViewById(R.id.dia);
        dental = findViewById(R.id.dental);
        urology = findViewById(R.id.uro);
        gastro = findViewById(R.id.gastro);
        orthopedic = findViewById(R.id.ortho);
        otolar =  findViewById(R.id.otolar);
        nephrology =  findViewById(R.id.nephro);
        paralysis = findViewById(R.id.para);
        skin =  findViewById(R.id.skin);
        laparo = findViewById(R.id.lapar);
        microbio = findViewById(R.id.micro);
        radio = findViewById(R.id.radio);
        sono= findViewById(R.id.sono);
        surgon = findViewById(R.id.srgn);

        // add click listener to the cards
        pediatric.setOnClickListener(this);
        medicine.setOnClickListener(this);
        eye.setOnClickListener(this);
        psychology.setOnClickListener(this);
        neurology.setOnClickListener(this);
        cardiology.setOnClickListener(this);
        spinal.setOnClickListener(this);
        gynecology.setOnClickListener(this);
        diabetes.setOnClickListener(this);
        dental.setOnClickListener(this);
        urology.setOnClickListener(this);
        gastro.setOnClickListener(this);
        orthopedic.setOnClickListener(this);
        otolar.setOnClickListener(this);
        nephrology.setOnClickListener(this);
        paralysis.setOnClickListener(this);
        skin.setOnClickListener(this);
        laparo.setOnClickListener(this);
        microbio.setOnClickListener(this);
        radio.setOnClickListener(this);
        sono.setOnClickListener(this);
        surgon.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.ped){
            Intent intent = new Intent(DoctorsDpt.this,ChildSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.medi){
            Intent intent = new Intent(DoctorsDpt.this,MedicineSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.eye){
            Intent intent = new Intent(DoctorsDpt.this,EyeSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.psycho){
            Intent intent = new Intent(DoctorsDpt.this,Psychologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.neuro){
            Intent intent = new Intent(DoctorsDpt.this,Neurologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.cardio){
            Intent intent = new Intent(DoctorsDpt.this,Cardiologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.spinal){
            Intent intent = new Intent(DoctorsDpt.this,SpinalSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.gyne){
            Intent intent = new Intent(DoctorsDpt.this,Gynecologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.dia){
            Intent intent = new Intent(DoctorsDpt.this,DiabetesSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.dental){
            Intent intent = new Intent(DoctorsDpt.this,Dentists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.uro){
            Intent intent = new Intent(DoctorsDpt.this,Urologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.gastro){
            Intent intent = new Intent(DoctorsDpt.this,Gastroenterologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.nephro){
            Intent intent = new Intent(DoctorsDpt.this,Nephrologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.para){
            Intent intent = new Intent(DoctorsDpt.this,ParalysisSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.skin){
            Intent intent = new Intent(DoctorsDpt.this,SkinSpecialists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.lapar){
            Intent intent = new Intent(DoctorsDpt.this,Laparoscopists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.micro){
            Intent intent = new Intent(DoctorsDpt.this,Microbiologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.radio){
            Intent intent = new Intent(DoctorsDpt.this,Radiologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.sono){
            Intent intent = new Intent(DoctorsDpt.this,Sonologists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.srgn){
            Intent intent = new Intent(DoctorsDpt.this,Surgeons.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.ortho){
            Intent intent = new Intent(DoctorsDpt.this,Orthopedists.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.otolar){
            Intent intent = new Intent(DoctorsDpt.this,Otolayngologists.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.drptmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == R.id.menu_home){
            Intent intent = new Intent(DoctorsDpt.this,MainActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_help){
            Intent intent = new Intent(DoctorsDpt.this,HelpActivity.class);
            startActivity(intent);
        }
        if(id == R.id.menu_about){
            Intent intent = new Intent(DoctorsDpt.this,AboutDeveloper.class);
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