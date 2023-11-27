package com.example.mad_project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class ProductActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        RecyclerView recyclerView = findViewById(R.id.product_recycler_view);
        // Set up RecyclerView adapter and layout manager
        adapter = new ProductAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Example of adding a click listener to navigate to CartActivity when a product is clicked
        adapter.setOnItemClickListener(position -> {
            startActivity(new Intent(ProductActivity.this, CartActivity.class));
        });
    }
}