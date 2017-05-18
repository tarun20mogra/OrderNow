package com.example.tarun.ordernow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tarun on 5/8/2017.
 */

public class Adapter extends ArrayAdapter<FoodMenu> {

    //Adapter Class
    public Adapter(Context context, ArrayList<FoodMenu> menuName) {
        super(context, R.layout.model, menuName);
    }

    //View Holder class
    public class ViewHolder {
        TextView textViewName;
        TextView textViewPrice;
        ImageView imageView;
    }

    //Get view overrride
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        FoodMenu menu = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model, parent, false);
        }

        final ViewHolder holder = new ViewHolder();

        //declaring the values for holder
        holder.textViewName = (TextView) convertView.findViewById(R.id.menuName);
        holder.textViewPrice = (TextView) convertView.findViewById(R.id.menuPrice);
        holder.imageView = (ImageView) convertView.findViewById(R.id.menuImage);

        //assigning the values to holder
        holder.imageView.setImageResource(menu.getImg());
        holder.textViewName.setText(menu.getName());
        holder.textViewPrice.setText(""  + menu.getPrice());

        return convertView;
    }
}
