package com.oluwatimilehin.tourlagos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractions = (TextView) findViewById(R.id.attractions);
        if(attractions != null) {
            attractions.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, AttractionsActivity.class);
                    startActivity(i);
                }
            });
        }

        TextView hotels = (TextView) findViewById(R.id.hotels);
        if(hotels != null){
            hotels.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, HotelsActivity.class);
                    startActivity(i);
                }
            });
        }

        TextView rentals = (TextView) findViewById(R.id.rentals);
        rentals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RentalsActivity.class);
                startActivity(i);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(i);
            }
        });
    }





}
