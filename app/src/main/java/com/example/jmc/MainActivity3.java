package com.example.jmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bj,bq,bk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        bj = (Button) findViewById(R.id.bj);
        bq = (Button) findViewById(R.id.bq);
        bk = (Button) findViewById(R.id.bk);


        Intent intent = getIntent();
        String nombre = intent.getStringExtra("palo");

        int picas = R.drawable.a;
        switch (nombre) {
            case "picas":
                break;
            case "corazones":
                b1.setBackgroundResource(picas);
                b2.setBackgroundResource(picas);
                b3.setBackgroundResource(picas);
                b4.setBackgroundResource(picas);
                b5.setBackgroundResource(picas);
                b6.setBackgroundResource(picas);
                b7.setBackgroundResource(picas);
                b8.setBackgroundResource(picas);
                b9.setBackgroundResource(picas);
                b10.setBackgroundResource(picas);
                bj.setBackgroundResource(picas);
                bq.setBackgroundResource(picas);
                bk.setBackgroundResource(picas);
                break;
            case "treboles" :
                b1.setBackgroundResource(picas);
                b2.setBackgroundResource(picas);
                b3.setBackgroundResource(picas);
                b4.setBackgroundResource(picas);
                b5.setBackgroundResource(picas);
                b6.setBackgroundResource(picas);
                b7.setBackgroundResource(picas);
                b8.setBackgroundResource(picas);
                b9.setBackgroundResource(picas);
                b10.setBackgroundResource(picas);
                bj.setBackgroundResource(picas);
                bq.setBackgroundResource(picas);
                bk.setBackgroundResource(picas);
                break;
            case "diamantes" :
                b1.setBackgroundResource(picas);
                b2.setBackgroundResource(picas);
                b3.setBackgroundResource(picas);
                b4.setBackgroundResource(picas);
                b5.setBackgroundResource(picas);
                b6.setBackgroundResource(picas);
                b7.setBackgroundResource(picas);
                b8.setBackgroundResource(picas);
                b9.setBackgroundResource(picas);
                b10.setBackgroundResource(picas);
                bj.setBackgroundResource(picas);
                bq.setBackgroundResource(picas);
                bk.setBackgroundResource(picas);
                break;
            default:
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b1.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",picas);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b2.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b3.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b4.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b5.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b6.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b7.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b8.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b9.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=b10.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        bj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=bj.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=bq.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });
        bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String img=bk.getBackground().toString();
                Intent i =new Intent(MainActivity3.this,MainActivity5.class);
                i.putExtra("img",img);
                startActivity(i);
            }
        });

    }
}