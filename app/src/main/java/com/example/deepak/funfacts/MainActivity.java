package com.example.deepak.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring View Variables
    private TextView mFactTextView;
    private Button mFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Views from layout file to corresponding variables
        mFactTextView = (TextView) findViewById(R.id.funFactTextext);
        mFactButton = (Button) findViewById(R.id.showFactButton);

        //Define a click handler for Button.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = "Ostriches can run faster than horses.";
                mFactTextView.setText(fact);

            }
        };

        mFactButton.setOnClickListener(listener);
    }
}
