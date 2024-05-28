package com.example.addschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void goBack(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void strartActivity2 (View v) {
        Intent intent = new Intent(this, Monday.class);
        startActivity(intent);
    }
    public void strartActivity3 (View v) {
        Intent intent = new Intent(this, Tuesday.class);
        startActivity(intent);
    }
    public void strartActivity6 (View v) {
        Intent intent = new Intent(this, Wednesday.class);
        startActivity(intent);
    }
    public void strartActivity4 (View v) {
        Intent intent = new Intent(this, Thursday.class);
        startActivity(intent);
    }
    public void strartActivity5 (View v) {
        Intent intent = new Intent(this, Friday.class);
        startActivity(intent);
    }

}

