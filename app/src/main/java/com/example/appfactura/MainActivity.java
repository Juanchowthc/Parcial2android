package com.example.appfactura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton01 = findViewById(R.id.imageButton01);
        imageButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, comprar.class);
                intent.putExtra("price", 64000); // Precio para el botón 1
                startActivity(intent);
            }
        });

        ImageButton imageButton02 = findViewById(R.id.imageButton02);
        imageButton02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, comprar.class);
                intent.putExtra("price", 97000); // Precio para el botón 2
                startActivity(intent);
            }
        });

        ImageButton imageButton03 = findViewById(R.id.imageButton03);
        imageButton03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, comprar.class);
                intent.putExtra("price", 85000); // Precio para el botón 3
                startActivity(intent);
            }
        });

        ImageButton imageButton04 = findViewById(R.id.imageButton04);
        imageButton04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, comprar.class);
                intent.putExtra("price", 102000); // Precio para el botón 4
                startActivity(intent);
            }
        });
    }
}