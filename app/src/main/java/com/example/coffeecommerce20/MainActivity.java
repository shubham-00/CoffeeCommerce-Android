package com.example.coffeecommerce20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Product mTempProduct = new Product();

    private List<Product> productList = new ArrayList<>();
    private RecyclerView rView;
    private ProductAdapter mAdapter;
    Button checkoutButton;
    ProductSingleton pSingleton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pSingleton = ProductSingleton.getProductSingleton();
        productList = pSingleton.getProductList();

        rView = findViewById(R.id.recyclerView);
        mAdapter = new ProductAdapter(productList);
        rView.setLayoutManager(new GridLayoutManager(this, 1));
        rView.setAdapter(mAdapter);

        checkoutButton = findViewById(R.id.checkout);

        checkoutButton.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), CheckoutActivity.class);
            startActivity(i);
        });

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        // rView.setLayoutManager(mLayoutManager);
        rView.setItemAnimator(new DefaultItemAnimator());

        rView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        rView.setAdapter(mAdapter);
    }

    // add a method to add a new product

    // add any other method which is necessary
}
