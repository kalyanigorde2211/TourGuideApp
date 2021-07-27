package com.example.tourguide_pune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);


        ArrayList<person> lst = new ArrayList<>();

        lst.add(new person(R.drawable.okayama,"Okayama Garden","Also named as Friendship garden!","Visit between 9am to 8pm"));
        lst.add(new person(R.drawable.fort,"Shaniwar Wada","It is historical fortification in the pune city!","Visit between 8am to 5pm"));
        lst.add(new person(R.drawable.lavasa,"Lavasa City","It is a beautiful project stylistically based on Italian town Portofino",
                " Visit between 9am to 8pm"));
        lst.add(new person(R.drawable.ganpati,"Dagdusheth Ganpati","The temple dedicated to Hindu god Ganesh!","Visit between 6am to 10pm"));
        lst.add(new person(R.drawable.saras,"Saras Baugh","Saras Baugh is a popular attraction in pune which was initially a lake at the foothills of Parvati!",
                "Visit between 7am to 8pm"));

        PersonAdapter adapter = new PersonAdapter(this,R.layout.activity_attractions,lst);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
