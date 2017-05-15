package com.example.tarun.ordernow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {
    ImageButton subwaybutton;
    ImageButton tacobutton;
    ImageButton starbucksbutton;
    ImageButton qdobabutton;
    Restaurant subwayObj;
    Restaurant qdobaobj;
    Restaurant tacoobj;
    Restaurant pandaexpressobj;
    Restaurant starbucks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subwaybutton = (ImageButton) findViewById(R.id.subway);
        tacobutton = (ImageButton) findViewById(R.id.taco);
        starbucksbutton = (ImageButton) findViewById(R.id.starbucks);
        qdobabutton = (ImageButton) findViewById(R.id.qdoba);


        ArrayList<FoodMenu> subwayMenu = new ArrayList<>();
        subwayMenu.add(new FoodMenu("Veggie Delight", 6.0D, R.drawable.submenu));
        subwayMenu.add(new FoodMenu("Chicken Delight", 6.0D, R.drawable.submenu));
        subwayMenu.add(new FoodMenu("Rosted Chicken", 6.0D, R.drawable.submenu));
        subwayMenu.add(new FoodMenu("Chicken Teriyaki", 6.0D, R.drawable.submenu));
        subwayMenu.add(new FoodMenu("Italian BBQ", 6.0D, R.drawable.submenu));
        subwayMenu.add(new FoodMenu("Italian BQT", 6.0D, R.drawable.submenu));
        subwayObj = new Restaurant("subway", subwayMenu);

        ArrayList<FoodMenu> qudobaMenu = new ArrayList<>();
        qudobaMenu.add(new FoodMenu("Veggie Bowl", 6.0D, R.drawable.submenu));
        qudobaMenu.add(new FoodMenu("Chicken Bowl", 6.0D, R.drawable.submenu));
        qudobaMenu.add(new FoodMenu("Burrito", 6.0D, R.drawable.submenu));
        qudobaMenu.add(new FoodMenu("Wrap", 6.0D, R.drawable.submenu));
        qudobaMenu.add(new FoodMenu("Nachos", 6.0D, R.drawable.submenu));
        qudobaMenu.add(new FoodMenu("Fajito", 6.0D, R.drawable.submenu));
        qdobaobj = new Restaurant("Qudoba", qudobaMenu);

        ArrayList<FoodMenu> tacoBellMenu = new ArrayList<>();
        tacoBellMenu.add(new FoodMenu("Veggie Bowl", 6.0D, R.drawable.submenu));
        tacoBellMenu.add(new FoodMenu("Chicken Bowl", 6.0D, R.drawable.submenu));
        tacoBellMenu.add(new FoodMenu("Burrito", 6.0D, R.drawable.submenu));
        tacoBellMenu.add(new FoodMenu("Wrap", 6.0D, R.drawable.submenu));
        tacoBellMenu.add(new FoodMenu("Nachos", 6.0D, R.drawable.submenu));
        tacoBellMenu.add(new FoodMenu("Fajito", 6.0D, R.drawable.submenu));
        tacoobj = new Restaurant("Tacobell", tacoBellMenu);

        ArrayList<FoodMenu> pandaExpressMenu = new ArrayList<>();
        pandaExpressMenu.add(new FoodMenu("Veggie Bowl", 6.0D, R.drawable.submenu));
        pandaExpressMenu.add(new FoodMenu("Chicken Bowl", 6.0D, R.drawable.submenu));
        pandaExpressMenu.add(new FoodMenu("Burrito", 6.0D, R.drawable.submenu));
        pandaExpressMenu.add(new FoodMenu("Wrap", 6.0D, R.drawable.submenu));
        pandaExpressMenu.add(new FoodMenu("Nachos", 6.0D, R.drawable.submenu));
        pandaExpressMenu.add(new FoodMenu("Fajito", 6.0D, R.drawable.submenu));
        pandaexpressobj = new Restaurant("Panda Express", pandaExpressMenu);

        ArrayList<FoodMenu> starBucksMenu = new ArrayList<>();
        starBucksMenu.add(new FoodMenu("Esperreso", 6.0D, R.drawable.submenu));
        starBucksMenu.add(new FoodMenu("Frapechinos", 6.0D, R.drawable.submenu));
        starBucksMenu.add(new FoodMenu("mocha", 6.0D, R.drawable.submenu));
        starBucksMenu.add(new FoodMenu("white moca", 6.0D, R.drawable.submenu));
        starBucksMenu.add(new FoodMenu("javachip", 6.0D, R.drawable.submenu));
        starBucksMenu.add(new FoodMenu("smoothies", 6.0D, R.drawable.submenu));
        starbucks = new Restaurant("Starbucks", pandaExpressMenu);
    }


    void menuList(View view) {
        String IdAsString = view.getResources().getResourceEntryName(view.getId());
//        Toast.makeText(this, IdAsString, Toast.LENGTH_SHORT).show();

        switch (IdAsString) {
            case "subway":
                try {
                    Intent subintent = new Intent(this, MeuActivity.class);
                    subintent.putExtra("sampleObject", subwayObj);
                    startActivity(subintent);
                } catch (Exception e) {
                    Toast.makeText(this, "Error Caught", Toast.LENGTH_SHORT).show();
                }
                break;
            case "taco":
                Intent tacointent = new Intent(this, MeuActivity.class);
                tacointent.putExtra("sampleObject", tacoobj);
                startActivity(tacointent);
                break;
            case "starbucks":
                Intent starbucsintent = new Intent(this, MeuActivity.class);
                starbucsintent.putExtra("sampleObject", starbucks);
                startActivity(starbucsintent);
                break;
            case "pandaexpress":
                Intent pandaintent = new Intent(this, MeuActivity.class);
                pandaintent.putExtra("sampleObject", pandaexpressobj);
                startActivity(pandaintent);
                break;
            case "qdoba":
                Intent qdobaintent = new Intent(this, MeuActivity.class);
                qdobaintent.putExtra("sampleObject", qdobaobj);
                startActivity(qdobaintent);
                break;
        }
        finish();
    }
}