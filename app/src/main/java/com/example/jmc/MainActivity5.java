package com.example.jmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    ImageView carta,dorso;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        carta = (ImageView) findViewById(R.id.carta);
        dorso = (ImageView) findViewById(R.id.dorso);
        t = (TextView) findViewById(R.id.txt);
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("img");
        t.setText(nombre);
    }
}