package com.example.tarun.ordernow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tarun.ordernow.Adapter;
import com.example.tarun.ordernow.FoodMenu;
import com.example.tarun.ordernow.R;
import com.example.tarun.ordernow.Restaurant;

import java.util.ArrayList;

public class MeuActivity extends AppCompatActivity {

    //DECLARATION
    ListView listView;
    Restaurant restaurant;
    FloatingActionButton fab;
    ArrayList<FoodMenu> selection = new ArrayList<FoodMenu>();

    @Override
    //Calling OnCreate Method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Reciving the intent from Main Activity on click of some button
        Intent intent = getIntent();
        restaurant = (Restaurant) intent.getSerializableExtra("sampleObject");

        //Creating a custom list view
        listView = (ListView) findViewById(R.id.listView);

        //Adapter call
        Adapter adapter = new Adapter(this, restaurant.getMenuArrayList());
        listView.setAdapter(adapter);

        //Stting On click property of list content
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MeuActivity.this, restaurant.getMenuArrayList().get(position).getName(), Toast.LENGTH_SHORT).show();
                selection.add(restaurant.getMenuArrayList().get(position));
            }
        });

        // Fab button creation...which act as a cart for the application
        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent billingintent = new Intent(MeuActivity.this, BillingActivity.class);
                billingintent.putExtra("resturant", restaurant);
                billingintent.putExtra("selection", selection);
                startActivityForResult(billingintent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();
//
//        if (requestCode == 1) {
//            Toast.makeText(this, "done", Toast.LENGTH_SHORT).show();
//                selection.clear();
//                selection = (ArrayList<FoodMenu>) data.getSerializableExtra("selection");
//                Toast.makeText(this, selection.size() + "", Toast.LENGTH_SHORT).show();
//        }
        selection.clear();
    }
}
