package com.example.tourguide_pune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);


        ArrayList<person> lst = new ArrayList<>();

        lst.add(new person(R.drawable.blue_diamond,"Blue Diamond","11,Koregaon Park Rd, Vasani Nagar, Koregaon Park, Pune",
                "Visit between 9am to 10pm"));
        lst.add(new person(R.drawable.conrad,"Conrad Restaurant","7, Mangaldas Rd, Sangamvadi,Pune","Visit between 8am to 9pm"));
        lst.add(new person(R.drawable.hyatty,"Hyatty Residences","Weikfield IT Park, Pune Nagar Road, Pune",
                " Visit between 9am to 8pm"));
        lst.add(new person(R.drawable.novotel,"Novotel","Weikfield It City Infopark, Nagar Rd, Pune","Visit between 6am to 10pm"));
        lst.add(new person(R.drawable.sheraton,"Sheraton Bar","Raja Bahadur Mill Rd, Sangamvadi, Pune",
                "Visit between 7am to 8pm"));

        PersonAdapter adapter = new PersonAdapter(this,R.layout.activity_attractions,lst);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
