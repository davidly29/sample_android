package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView textViewCard;
    TextView textViewTotal;
    TextView textViewPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textViewCard = (TextView) findViewById(R.id.textViewCard);
        textViewTotal = (TextView) findViewById(R.id.textViewTotal);
        textViewPoints = (TextView) findViewById(R.id.textViewPoints);

        Intent intent = getIntent();
        String card =  "Card: " + intent.getStringExtra("Card");
        String tip = "Tip: " + intent.getStringExtra("Tip");
        String point = "Bill: " + intent.getStringExtra("Value");

        textViewCard.setText(card);
        textViewTotal.setText(tip);
        textViewPoints.setText(point);

    }
}
