package com.example.proyek.proyekbesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class PilihLevel extends AppCompatActivity {
    ImageButton button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_level);
        button1 = (ImageButton) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PilihLevel.this, Level1.class);
                startActivity(i);
            }
        });


        button2 = (ImageButton) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PilihLevel.this, Level2.class);
                startActivity(i);
            }
        });


        button3 = (ImageButton) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PilihLevel.this, Level3.class);
                startActivity(i);
            }
        });


        button4 = (ImageButton) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PilihLevel.this, Level4.class);
                startActivity(i);
            }
        });
    }
}
