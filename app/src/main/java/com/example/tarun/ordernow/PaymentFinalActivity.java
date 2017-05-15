package com.example.tarun.ordernow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentFinalActivity extends AppCompatActivity {
    EditText nameText, numberText;
    Button payButton ;
    TextView textView;
    double price = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_final);
        Intent intent = getIntent();
        double s = intent.getDoubleExtra("sampleObject", price);
        textView = (TextView) findViewById(R.id.price);
        textView.setText(""+s);
        payButton = (Button) findViewById(R.id.orderButton);
        nameText = (EditText) findViewById(R.id.nameEditText);
        numberText = (EditText) findViewById(R.id.phoneEditText);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nameText.getText().toString().equals("")&& numberText.getText().toString().equals("")){
                    Toast.makeText(PaymentFinalActivity.this, "Please enter name and phone number", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(PaymentFinalActivity.this, "Order Placed", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
