package com.example.aubreyfletcher.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    private Button counterButton;
    private TextView counterNumber;
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        //Assign the buttons
        counterNumber = findViewById(R.id.counterNumber);
        counterButton = findViewById(R.id.counterButton);

        counterButton.setOnClickListener(
                new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num++;
                counterNumber.setText(num + "");
            }
        }
        );


    }
}
