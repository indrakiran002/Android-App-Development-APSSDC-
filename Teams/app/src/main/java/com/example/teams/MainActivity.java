package com.example.teams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button x1,x2,x3,x4,x5,x6,x7;
    TextView t1,t2;
    int a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x1 = findViewById(R.id.a1);
        x2 = findViewById(R.id.a2);
        x3 = findViewById(R.id.a3);
        x4 = findViewById(R.id.b1);
       x5 = findViewById(R.id.b2);
        x6 = findViewById(R.id.b3);
        x7 = findViewById(R.id.reset);
        t1 = findViewById(R.id.ta);
        t2 = findViewById(R.id.tv);
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                t1.setText(""+a);
            }
        });

        x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+2;
                t1.setText(""+a);
            }
        });
        x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=a+3;
                t1.setText(""+a);
            }
        });

        x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                t2.setText(""+b);
            }
        });

        x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+2;
                t2.setText(""+b);
            }
        });

        x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=b+3;
                t2.setText(""+b);
            }
        });

        x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=0;
                a=0;
                t2.setText("0");
                t1.setText("0");
            }
        });








    }
}