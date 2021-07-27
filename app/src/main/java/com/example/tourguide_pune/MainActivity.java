package com.example.tourguide_pune;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractions = (TextView) findViewById(R.id.Attractions);
        attractions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        TextView hotels = (TextView) findViewById(R.id.Hotels);
        hotels.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        TextView food = (TextView) findViewById(R.id.Food);
        food.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, FoodActivity.class);
                startActivity(foodIntent);
            }
        });

        TextView shopping = (TextView) findViewById(R.id.Shopping);
        shopping.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });
    }
}