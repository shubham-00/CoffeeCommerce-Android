package com.example.coffeecommerce20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckoutActivity extends AppCompatActivity {
    EditText cardNumber, email;
    Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        cardNumber = findViewById(R.id.cardNumber);
        email = findViewById(R.id.email);
        pay = findViewById(R.id.pay);

        pay.setOnClickListener(v -> {
            JavaMailAPI javaMailAPI = new JavaMailAPI(this, email.getText().toString().trim(), "Receipt from CoffeeCommerce", "We've received your payment from Card ending with " + cardNumber.getText().toString().trim().substring(12, 16) + "\n");
            // javaMailAPI.execute();
            javaMailAPI.execute();
            // javaMailAPI.doInBackground();
            Toast.makeText(this, "Payment successful!", Toast.LENGTH_SHORT);

            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });



    }
}
