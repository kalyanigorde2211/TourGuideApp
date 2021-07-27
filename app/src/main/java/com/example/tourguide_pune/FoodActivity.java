package com.example.tourguide_pune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        ArrayList<person> lst = new ArrayList<>();

        lst.add(new person(R.drawable.burger,"Burger","PARADISE,Furgusson Road,Pune",
                "Visit between 9am to 10pm"));
        lst.add(new person(R.drawable.chicken,"Chicken","Twilight shop,Laxami Road,Pune","Visit between 8am to 9pm"));
        lst.add(new person(R.drawable.noodles,"Noodles","WELCOME,Bibvewadi Road,Pune",
                " Visit between 9am to 8pm"));
        lst.add(new person(R.drawable.indian_thali,"Indian Thali","Refresh,Kothrud Road","Visit between 6am to 10pm"));
        lst.add(new person(R.drawable.puranpoli,"Delightful shop,Puran Poli","Katraz Diary Road, Pune",
                "Visit between 7am to 8pm"));

        PersonAdapter adapter = new PersonAdapter(this,R.layout.activity_attractions,lst);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
