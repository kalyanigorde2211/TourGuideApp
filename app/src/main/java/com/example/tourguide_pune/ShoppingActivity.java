package com.example.tourguide_pune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);


        ArrayList<person> lst = new ArrayList<>();

        lst.add(new person(R.drawable.pheonix,"Pheonix Mall","For all types of shopping",
                "Visit between 9am to 10pm"));
        lst.add(new person(R.drawable.central,"City Central Mall","Best for Clothes","Visit between 8am to 9pm"));
        lst.add(new person(R.drawable.tulsi,"Tulsi Baugh","Best for Jwellery",
                " Visit between 9am to 8pm"));
        lst.add(new person(R.drawable.furgusson,"Furgusson Road","Everything Available","Visit between 6am to 10pm"));
        lst.add(new person(R.drawable.magnet,"Magnet Mall","Everything is Great here!",
                "Visit between 7am to 8pm"));

        PersonAdapter adapter = new PersonAdapter(this,R.layout.activity_attractions,lst);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
