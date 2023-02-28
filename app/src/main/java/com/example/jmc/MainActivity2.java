package com.example.jmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1 = (Button) findViewById(R.id.picas);
        b2 = (Button) findViewById(R.id.corazones);
        b3 = (Button) findViewById(R.id.treboles);
        b4 = (Button) findViewById(R.id.diamantes);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                    i.putExtra("palo","picas");
                    startActivity(i);
                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                    i.putExtra("palo","corazones");
                    startActivity(i);
                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                    i.putExtra("palo","treboles");
                    startActivity(i);
                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                    i.putExtra("palo","diamantes");
                    startActivity(i);
                }
            });
    }
}