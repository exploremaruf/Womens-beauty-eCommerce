package com.maruf.womenbeauty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    LinearLayout clothing_section,jewelry_section,shoes_section,makeup_section;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            v.setPadding(systemBars.left, 0, systemBars.right, systemBars.bottom);
            return insets;
        });

        clothing_section =findViewById(R.id.clothing_section);
        jewelry_section =findViewById(R.id.jewelry_section);
        shoes_section =findViewById(R.id.shoes_section);
        makeup_section =findViewById(R.id.makeup_section);

        //**************************************************************************************
        //**************************************************************************************

        clothing_section.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Products.class);
                intent.putExtra("category","clothing");
                startActivity(intent);
            }
        });
        jewelry_section.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Products.class);
                intent.putExtra("category","jewelry");
                startActivity(intent);
            }
        });
        shoes_section.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Products.class);
                intent.putExtra("category","shoes");
                startActivity(intent);
            }
        });
        makeup_section.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,Products.class);
                intent.putExtra("category","makeup");
                startActivity(intent);
            }
        });







    }

}