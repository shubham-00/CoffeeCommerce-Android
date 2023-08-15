package com.example.coffeecommerce20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDisplayActivity extends AppCompatActivity {
    ImageView dThumbnail;
    TextView dPrice;
    TextView dDescription;
    TextView dTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_display);

        dThumbnail = findViewById(R.id.dThumbnail);
        dPrice = findViewById(R.id.dPrice);
        dDescription = findViewById(R.id.dDescription);
        dTitle = findViewById(R.id.dTitle);

        Intent i = getIntent();
        String thumbnail = i.getStringExtra("thumbnail");
        String price = i.getStringExtra("price");
        String description = i.getStringExtra("description");
        String title = i.getStringExtra("title");

        int resid = getResources().getIdentifier(thumbnail, "drawable", getPackageName());
        dThumbnail.setImageResource(resid);

        dPrice.setText(price);
        dDescription.setText(description);
        dTitle.setText(title);
    }
}
