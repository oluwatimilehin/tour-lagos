package com.oluwatimilehin.tourlagos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_list);

        ArrayList<Information> information = new ArrayList<Information>();

        information.add(new Information("Four Points by Sheraton","Plot 9/10, Block 2 | Oniru Chieftaincy Estate, Lagos 101008, Nigeria"));
        information.add(new Information("Southern Sun hotel","47 Alfred Rewane Road Ikoyi, Lagos, Nigeria","01 280 5200"));
        information.add(new Information("Radisson Blu Anchorage Hotel, Lagos","1A Ozumba Mbadiwe Road | Victoria Island, Lagos" ));
        information.add(new Information("The George","30 Lugard Avenue | Ikoyi, Lagos 101222, Nigeria" ));
        information.add(new Information("Leadway Hotel","1 Mogambo Close, Off Emmanuel Street | Maryland Estate","01 279 0800"  ));
        information.add(new Information("The Federal Palace Hotel","6 - 8 Ahmadu Bello Way, Lagos, Nigeria"));

        ListView list = (ListView) findViewById(R.id.list);
        InformationAdapter adapter = new InformationAdapter(this, information, R.color.category_hotel);

        list.setAdapter(adapter);

    }
}
