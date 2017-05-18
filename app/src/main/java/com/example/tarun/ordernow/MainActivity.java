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
    ImageButton carlsbutton;
    ImageButton tacobutton;
    ImageButton starbucksbutton;
    ImageButton qdobabutton;
    Restaurant subwayObj;
    Restaurant qdobaobj;
    Restaurant tacoobj;
    Restaurant pandaexpressobj;
    Restaurant starbucks;
    Restaurant carlsjrobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subwaybutton = (ImageButton) findViewById(R.id.subway);
        tacobutton = (ImageButton) findViewById(R.id.taco);
        starbucksbutton = (ImageButton) findViewById(R.id.starbucks);
        qdobabutton = (ImageButton) findViewById(R.id.qdoba);
        carlsbutton = (ImageButton)findViewById(R.id.carlsjr);


        ArrayList<FoodMenu> subwayMenu = new ArrayList<>();
        subwayMenu.add(new FoodMenu("Veggie Delight", 6.0D, R.drawable.veggiedelight));
        subwayMenu.add(new FoodMenu("Chicken Delight", 6.0D, R.drawable.chickendelight));
        subwayMenu.add(new FoodMenu("Rosted Chicken", 6.0D, R.drawable.chickenrosted));
        subwayMenu.add(new FoodMenu("Chicken Teriyaki", 6.0D, R.drawable.chickenteriyaki));
        subwayMenu.add(new FoodMenu("Italian BBQ", 6.0D, R.drawable.italianbbq));
        subwayMenu.add(new FoodMenu("Italian BQT", 6.0D, R.drawable.italianbqt));
        subwayObj = new Restaurant("subway", subwayMenu);

        ArrayList<FoodMenu> qudobaMenu = new ArrayList<>();
        qudobaMenu.add(new FoodMenu("Veggie Bowl", 6.0D, R.drawable.veggiebowl));
        qudobaMenu.add(new FoodMenu("Chicken Bowl", 6.0D, R.drawable.chickenbowl));
        qudobaMenu.add(new FoodMenu("Burrito", 6.0D, R.drawable.burito));
        qudobaMenu.add(new FoodMenu("Wrap", 6.0D, R.drawable.buritowrap));
        qudobaMenu.add(new FoodMenu("Nachos", 6.0D, R.drawable.nachos));
        qudobaMenu.add(new FoodMenu("Fajito", 6.0D, R.drawable.fajita));
        qdobaobj = new Restaurant("Qudoba", qudobaMenu);

        ArrayList<FoodMenu> tacoBellMenu = new ArrayList<>();
        tacoBellMenu.add(new FoodMenu("Veggie Bowl", 6.0D, R.drawable.veggiebowl));
        tacoBellMenu.add(new FoodMenu("Chicken Bowl", 6.0D, R.drawable.chickenbowl));
        tacoBellMenu.add(new FoodMenu("Burrito", 6.0D, R.drawable.burito));
        tacoBellMenu.add(new FoodMenu("Wrap", 6.0D, R.drawable.buritowrap));
        tacoBellMenu.add(new FoodMenu("Nachos", 6.0D, R.drawable.nachos));
        tacoBellMenu.add(new FoodMenu("Fajito", 6.0D, R.drawable.fajita));
        tacoobj = new Restaurant("Tacobell", tacoBellMenu);

        ArrayList<FoodMenu> pandaExpressMenu = new ArrayList<>();
        pandaExpressMenu.add(new FoodMenu("Orange Chicken", 6.0D, R.drawable.orangechicken));
        pandaExpressMenu.add(new FoodMenu("Five Flavour Shrimp", 6.0D, R.drawable.fiveshrimp));
        pandaExpressMenu.add(new FoodMenu("String Bean Chicken Breast", 6.0D, R.drawable.stringbeanchicken));
        pandaExpressMenu.add(new FoodMenu("Egg Roll", 6.0D, R.drawable.eggroll));
        pandaExpressMenu.add(new FoodMenu("Sweet Fire Chicken Breast", 6.0D, R.drawable.sweetfire));
        pandaExpressMenu.add(new FoodMenu("Mushroom Chicken", 6.0D, R.drawable.mushroomchicken));
        pandaexpressobj = new Restaurant("Panda Express", pandaExpressMenu);

        ArrayList<FoodMenu> starBucksMenu = new ArrayList<>();
        starBucksMenu.add(new FoodMenu("Esperreso", 6.0D, R.drawable.espresso));
        starBucksMenu.add(new FoodMenu("Frappuccino", 6.0D, R.drawable.frapicuno));
        starBucksMenu.add(new FoodMenu("mocha", 6.0D, R.drawable.mocha));
        starBucksMenu.add(new FoodMenu("white mocha", 6.0D, R.drawable.whitemocha));
        starBucksMenu.add(new FoodMenu("javachip", 6.0D, R.drawable.javachip));
        starBucksMenu.add(new FoodMenu("smoothies", 6.0D, R.drawable.smoothie));
        starbucks = new Restaurant("Starbucks", starBucksMenu);

        ArrayList<FoodMenu> carlsJuniorMenu = new ArrayList<>();
        carlsJuniorMenu.add(new FoodMenu("Baby Back Rib Thickburger ", 6.0D, R.drawable.babybackriv1));
        carlsJuniorMenu.add(new FoodMenu("The Double Baby Back Rib Thickburger ", 6.0D, R.drawable.babyrib));
        carlsJuniorMenu.add(new FoodMenu("The 1/3LB. Baby Back Rib Thickburger ", 6.0D, R.drawable.babybackriv1));
        carlsJuniorMenu.add(new FoodMenu("Jalapeno Double Cheeseburger ", 6.0D, R.drawable.jalepeno));
        carlsJuniorMenu.add(new FoodMenu("Famous star with cheese", 6.0D, R.drawable.fullsuperstar));
        carlsJuniorMenu.add(new FoodMenu("Super Star with Cheese", 6.0D, R.drawable.supercheese));
        carlsjrobj = new Restaurant("Starbucks", carlsJuniorMenu);
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
            case "carlsjr":
                Intent carlsintent = new Intent(this, MeuActivity.class);
                carlsintent.putExtra("sampleObject", carlsjrobj);
                startActivity(carlsintent);
                break;
        }
        finish();
    }
}