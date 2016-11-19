package com.oluwatimilehin.tourlagos;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by timad on 19/11/2016.
 */
public class InformationAdapter extends ArrayAdapter<Information>{

    private int mColorResourceId;

    public InformationAdapter(Activity context, ArrayList<Information> information, int colorResourceId){

        super(context, 0, information);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Information currentInformation = getItem(position);

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentInformation.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentInformation.getAddress());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.number_text_view);
        if(currentInformation.hasPhoneNumber()){
            numberTextView.setText(currentInformation.getPhoneNumber());
            numberTextView.setVisibility(View.VISIBLE);
        }
        else{
            numberTextView.setVisibility(View.GONE);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentInformation.hasImage()){
            imageView.setImageResource(currentInformation.getImgResourceId());
            imageView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.image_background));
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        View containerColor = listItemView.findViewById(R.id.container_color);
        containerColor.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));

        return listItemView;
    }
}
