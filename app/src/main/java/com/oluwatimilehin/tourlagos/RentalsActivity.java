package com.oluwatimilehin.tourlagos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RentalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list);

        ArrayList<Information> information = new ArrayList<Information>();
        information.add(new Information("Luxury Flats", "Victoria Island", "2 bedrooms, 2 bathrooms", R.drawable.luxury_flats));
        information.add(new Information("The Premier Apartments","Opebi", "2 bathrooms, 2 bathrooms", R.drawable.the_premier_apartments));
        information.add(new Information("Lyncorp Apartments","Victoria Garden City", "3 bedrooms, 2 bathrooms", R.drawable.lyncorp_apartments));
        information.add(new Information("Collington Charlet","Ikeja", "4 bathrooms, 7 bathrooms", R.drawable.collington_charlet));
        information.add(new Information("Cosy 24/7-serviced designer flat", "Oniru-Lekki","1 bedroom, 2 bathrooms", R.drawable.cosy_24_7_serviced));
        information.add(new Information("The Castle", "Magodo", "1 bedroom, 2 bathrooms", R.drawable.the_castle_magodo));

        ListView listView = (ListView) findViewById(R.id.list);
        InformationAdapter adapter = new InformationAdapter(this, information, R.color.category_rentals);
        listView.setAdapter(adapter);

    }


}
