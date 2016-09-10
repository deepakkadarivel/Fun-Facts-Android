package com.example.deepak.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    //Declaring View Variables
    private TextView mFactTextView;
    private Button mFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Views from layout file to corresponding variables
        mFactTextView = (TextView) findViewById(R.id.funFactTextext);
        mFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.parent_layout);

        //Define a click handler for Button.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mFactButton.setTextColor(color);

            }
        };

        mFactButton.setOnClickListener(listener);
    }
}
