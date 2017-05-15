package com.example.tarun.ordernow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class BillingActivity extends AppCompatActivity {
    //Declarations
    Restaurant restaurant;
    ArrayList<FoodMenu> selection;
    ListView listviewbilling ;
    double price = 0;
    Button button;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        Intent intent = getIntent();
        restaurant = (Restaurant) intent.getSerializableExtra("resturant");
        selection = (ArrayList<FoodMenu>) intent.getSerializableExtra("selection");
        while ( i < selection.size()){
            price = price + selection.get(i).getPrice();
            i++;
        }


        //creatin the list for the billing activity
        listviewbilling = (ListView)findViewById(R.id.billingListView);

        BillingAdapter billingAdapter = new BillingAdapter(this, selection);
        listviewbilling.setAdapter(billingAdapter);

        button = (Button) findViewById(R.id.payButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent payIntent = new Intent(BillingActivity.this, PaymentFinalActivity.class);
                payIntent.putExtra("sampleObject", price);
                startActivity(payIntent);
            }
        });

    }
}
