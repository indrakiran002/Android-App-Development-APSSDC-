package com.example.newcount;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView tv;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.countInc);
        tv = findViewById(R.id.textcount);
        b2 = findViewById(R.id.countDec);
        b3 = findViewById(R.id.countZ);
        b4 = findViewById(R.id.toast);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                tv.setText(""+a);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a--;
                tv.setText(""+a);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   a=0;
                    tv.setText("0");
                }
            });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display(v);
            }
        });

        if (savedInstanceState!=null){

            String s = savedInstanceState.getString("indra");
            tv.setText(s);
        }


    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putString("indra", tv.getText().toString());

    }

    public void display(View view) {

        Toast.makeText(this, "Your Count is: "+a, Toast.LENGTH_SHORT).show();

    }

}