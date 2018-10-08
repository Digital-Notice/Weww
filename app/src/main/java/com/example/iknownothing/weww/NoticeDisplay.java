package com.example.iknownothing.weww;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class NoticeDisplay extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_display);


        models = new ArrayList<>();
        String descrp="Please accept this letter as formal notification that I am resigning from my position with ABCD Company on Friday, March XX, 20XX. I understand that two weeks notice is standard; however, personal circumstances require that I leave my position at this company by the end of this week.\n" +
                "\n" +
                "I am glad to provide any assistance I can during this transition.\n" +
                "\n" +
                "Thank you for the opportunities for professional and personal development that you have provided me during the last five years.\n";
        models.add(new Model(R.drawable.ic_launcher_background,"Diwali Vacation","8/Oct","7:20 PM","Auditorium",descrp,"Bhupal Arya"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));
        models.add(new Model(R.drawable.ic_launcher_background,"Abhyudaya Interview","13/Oct","12:00","COER CAFETARIA",descrp,"Saharsh Pandey"));

        adapter = new Adapter(models,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(40,0,40,0);


    }
}
