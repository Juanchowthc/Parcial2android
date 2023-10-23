package com.example.appfactura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

public class comprar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprar);

        TextView priceTextView = findViewById(R.id.priceTextView);
        TextView ivaTextView = findViewById(R.id.ivaTextView);
        TextView totalTextView = findViewById(R.id.totalTextView);

        double precio = getIntent().getDoubleExtra("price", 0);
        double iva = precio * 0.19;
        double total = precio + iva;

        priceTextView.setText(" " + precio);
        ivaTextView.setText(" " + iva);
        totalTextView.setText(" " + total);

    }
}