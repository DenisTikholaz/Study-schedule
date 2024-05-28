package com.example.addschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Button button5;
    private Button buttonToday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button5 = findViewById(R.id.button5);
        buttonToday = findViewById(R.id.buttontoday);

        buttonToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityBasedOnDay();
            }
        });
    }

    public void startNewActivity1(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    private void openActivityBasedOnDay() {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        Intent intent;
        switch (dayOfWeek) {
            case Calendar.MONDAY:
                intent = new Intent(this, Monday.class);
                break;
            case Calendar.TUESDAY:
                intent = new Intent(this, Tuesday.class);
                break;
            case Calendar.WEDNESDAY:
                intent = new Intent(this, Wednesday.class);
                break;
            case Calendar.THURSDAY:
                intent = new Intent(this, Thursday.class);
                break;
            case Calendar.FRIDAY:
                intent = new Intent(this, Friday.class);
                break;
            case Calendar.SATURDAY:
            case Calendar.SUNDAY:
                intent = new Intent(this, Monday.class);
                break;
            default:
                intent = new Intent(this, MainActivity2.class);
                break;
        }
        startActivity(intent);
    }
}