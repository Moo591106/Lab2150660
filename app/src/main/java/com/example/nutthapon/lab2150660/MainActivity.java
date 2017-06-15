package com.example.nutthapon.lab2150660;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String yourName;
    String Lastname;
    String Tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    } public void sendData (View view){
        EditText editTextName = (EditText) findViewById(R.id.yourName);
        yourName = editTextName.getText().toString();

        EditText editTextyoursurname = (EditText) findViewById(R.id.Lastname);
        Lastname = editTextyoursurname.getText().toString();

        EditText editTextyourid = (EditText) findViewById(R.id.Tel);
        Tel = editTextyourid.getText().toString();


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("yourName",yourName);
        intent.putExtra("Lastname",Lastname);
        intent.putExtra("Tel",Tel);


        startActivity(intent);

    }
}
