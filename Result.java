package com.learn.uzair.daypinpoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView date, result, islamicDate, islamicDateWithMonthName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        date = findViewById(R.id.gregorian_date);
        result = findViewById(R.id.day_of_date);
        islamicDate = findViewById(R.id.hijrah_date);
        islamicDateWithMonthName = findViewById(R.id.hijrah_date_with_month_name);

        String dateString = getIntent().getStringExtra("Date");
        String resultString = getIntent().getStringExtra("Result");
        String islamicDateString = getIntent().getStringExtra("Islamic Date");
        String islamicDateWithMonthNameString = getIntent().getStringExtra("Islamic Date with Month Name");

        date.setText(dateString);
        result.setText(resultString);
        islamicDate.setText(islamicDateString);
        islamicDateWithMonthName.setText(islamicDateWithMonthNameString);
    }
}
