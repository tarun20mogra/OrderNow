package com.example.tarun.ordernow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by tarun on 5/9/2017.
 */

public class BillingAdapter extends ArrayAdapter<FoodMenu> {

    ArrayList<FoodMenu> selection;

    //Adapter Class
    public BillingAdapter(Context context, ArrayList<FoodMenu> selection) {
        super(context, R.layout.model, selection);
        this.selection = selection;

    }

    //View Holder class
    public class ViewHolder {
        TextView textViewName;
        TextView textViewPrice;
        ImageView imageView;
        Button deleteButton;

    }

    //Get view overrride
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final FoodMenu menu = getItem(position);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model2, parent, false);
        }

        final BillingAdapter.ViewHolder holder = new BillingAdapter.ViewHolder();

        //declaring the values for holder
        holder.textViewName = (TextView) convertView.findViewById(R.id.menuName);
        holder.textViewPrice = (TextView) convertView.findViewById(R.id.menuPrice);
        holder.imageView = (ImageView) convertView.findViewById(R.id.menuImage);
        holder.deleteButton = (Button)  convertView.findViewById(R.id.deleteButton);

        //assigning the values to holder
        holder.imageView.setImageResource(menu.getImg());

        holder.textViewName.setText(menu.getName());
        holder.textViewPrice.setText("" + menu.getPrice());

        holder.deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // remove(menu);
                selection.remove(position);
                notifyDataSetChanged();
                Toast.makeText(getContext(), selection.size() + "", Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}
