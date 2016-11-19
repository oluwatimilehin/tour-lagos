package com.oluwatimilehin.tourlagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list);

        ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information("Nike Art Centre", "2 Elegushi Road, Lagos, Nigeria", "+234 803 409 9656", R.drawable.nike_art_gallery));
        information.add(new Information("Lekki Conservation Centre", "KM 19, Lekki-Epe Expressway, Lagos, Nigeria", "+234 1 264 2498", R.drawable.lekki_conservation_centre));
        information.add(new Information("Freedom Park Lagos", "Address: Old Prison Ground Broad Street, Lagos 550104, Nigeria", R.drawable.freedom_park_lagos));
        information.add(new Information("Ikeja City Mall", "Obafemi Awolowo Way, Lagos 550104, Nigeria",R.drawable.ikeja_city_mall));
        information.add(new Information("Lekki Market", "Oba Elegushi Street | Off Lekki-Epe Expressway, Lagos, Nigeria", "+234 803 833 1862", R.drawable.lekki_market));
        information.add(new Information("Elegushi Beach", "Lekki, Lagos 550104, Nigeria", R.drawable.elegushi_beach));

        ListView listView =  (ListView) findViewById(R.id.list);

        InformationAdapter adapter = new InformationAdapter(this, information, R.color.category_attractions );

        listView.setAdapter(adapter);


    }


}
