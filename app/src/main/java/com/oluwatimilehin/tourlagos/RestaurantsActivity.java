package com.oluwatimilehin.tourlagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list);

        ArrayList<Information> information = new ArrayList<>();

        information.add(new Information("Hardrock Cafe","Water Corporation Road |Near Landmark Center","+2349081988888", R.drawable.hard_rock_cafe_lagos));
        information.add(new Information("Hans and Rene", "1 Ozumba Mbadiwe Road","8087773333", R.drawable.hans_and_rene));
        information.add(new Information("Sherlaton Indian Restaurant", "2-3 Adeola Odeku, V.I", "+23417601873", R.drawable.sherlaton_indian_restaurant));
        information.add(new Information("Ocean Basket","Plot 1392 | Tiamiyu Savage Street", "+2348160591821", R.drawable.ocean_basket));
        information.add(new Information("The Yellow Chilli Restaurant & Bar", "27 Bishop Oluwole St. Lagos", "+2348099623614", R.drawable.yellow_chilli_restaurant ));
        information.add(new Information("Spice bar", "44A Adeola Odeku Street, Victoria Island", "+23417615555", R.drawable.spice_bar));

        ListView listView = (ListView) findViewById(R.id.list);
        InformationAdapter adapter = new InformationAdapter(this, information, R.color.category_restaurants);

        listView.setAdapter(adapter);
    }
}
