package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextBill;
    EditText editTextTip;
    EditText editTextCard;

    TextView textViewTotal;

    String cardString, valueString, tipString;
    Button buttonCalculate;
    Button buttonDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextBill = (EditText) findViewById(R.id.editTextBill);
        editTextTip = (EditText) findViewById(R.id.editTextTip);
        editTextCard = (EditText) findViewById(R.id.editTextCard);

        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
        textViewTotal = (TextView) findViewById(R.id.textViewTotal);
        buttonDisplay = (Button) findViewById(R.id.buttonDisplay);


        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueString = editTextBill.getText().toString();
                tipString = editTextTip.getText().toString();
                cardString = editTextCard.getText().toString();

                int per = Integer.parseInt(tipString);
                int bill = Integer.parseInt(valueString);


                float tipMoney =  (int)(bill*(per/100.0f));
                float total = bill + tipMoney;

                textViewTotal.setText(String.valueOf(total));

            }
        });


        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueString = editTextBill.getText().toString();
                tipString = editTextTip.getText().toString();
                cardString = editTextCard.getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                intent.putExtra("Value", valueString);
                intent.putExtra("Tip", tipString);
                intent.putExtra("Card", cardString);

                startActivity(intent);


            }
        });
    }



}
