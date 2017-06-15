package com.example.nutthapon.lab2150660;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.name;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SharedPreferences SharedPreferences = getSharedPreferences("Moo", Context.MODE_PRIVATE);
        String yourName = SharedPreferences.getString("name","");


        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        String surname = intent.getStringExtra("Lastname");
        String idname = intent.getStringExtra("Tel");
        TextView textName = (TextView) findViewById(R.id.textView7);
        TextView textLast = (TextView) findViewById(R.id.textView8);
        TextView textTel = (TextView) findViewById(R.id.textView9);
        textName.setText(name);
        textLast.setText(surname);
        textTel.setText(idname);

        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        })*/;
    }

}
