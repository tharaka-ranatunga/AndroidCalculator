package com.example.tharaka_ra.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = (Button) findViewById(R.id.addition);
        Button btnSubstract = (Button) findViewById(R.id.substraction);
        Button btnMultiply = (Button) findViewById(R.id.multiplication);
        Button btnDivide = (Button) findViewById(R.id.division);
        final TextView first = (TextView) findViewById(R.id.first);
        final TextView last = (TextView) findViewById(R.id.last);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(first.getText().toString());
                double lastNumber = Double.parseDouble(last.getText().toString());
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(Double.toString(firstNumber+lastNumber));
            }
        });
        btnSubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(first.getText().toString());
                double lastNumber = Double.parseDouble(last.getText().toString());
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(Double.toString(firstNumber-lastNumber));
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(first.getText().toString());
                double lastNumber = Double.parseDouble(last.getText().toString());
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(Double.toString(firstNumber*lastNumber));
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double firstNumber = Double.parseDouble(first.getText().toString());
                double lastNumber = Double.parseDouble(last.getText().toString());
                TextView result = (TextView) findViewById(R.id.result);
                result.setText(Double.toString(firstNumber/lastNumber));
            }
        });

//        Button btnTest = (Button) findViewById(R.id.btnTest);
//
//        btnTest.setText("asdfasasdf");

    }
}
