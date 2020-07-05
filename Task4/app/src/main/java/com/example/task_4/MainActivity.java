package com.example.task_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   private EditText e1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.text);



    }

    public void open(View view) {

        String mssg = e1.getText().toString();

        Intent i = new Intent();
        i.setAction(Intent.ACTION_SEND);


        i.putExtra(Intent.EXTRA_TEXT, mssg);
        i.setType("text/plain");

        startActivity(i);

    }
}