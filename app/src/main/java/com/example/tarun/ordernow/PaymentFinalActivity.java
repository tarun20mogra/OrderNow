package com.example.tarun.ordernow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentFinalActivity extends AppCompatActivity {
    Restaurant restaurant;
    EditText nameEditText ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_final);
        Intent intent = getIntent();
        restaurant = (Restaurant) intent.getSerializableExtra("resturant");

        Toast.makeText(this, "Here", Toast.LENGTH_SHORT).show();
    }
}
