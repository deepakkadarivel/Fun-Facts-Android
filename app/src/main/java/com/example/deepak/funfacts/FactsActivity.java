package com.example.deepak.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FactsActivity extends AppCompatActivity {
    public static final String TAG = FactsActivity.class.getSimpleName();
    private static final String FACT_KEY = "FACT_KEY";
    private static final String FACT_COLOR = "FACT_COLOR";
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    //Declaring View Variables
    private TextView mFactTextView;
    private Button mFactButton;
    private RelativeLayout mRelativeLayout;
    private String mFact = mFactBook.mFacts[0];
    private int mColor = Color.parseColor(mColorWheel.mColors[8]);


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(FACT_KEY, mFact);
        outState.putInt(FACT_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mFact = savedInstanceState.getString(FACT_KEY);
        mColor = savedInstanceState.getInt(FACT_COLOR);

        mFactTextView.setText(mFact);
        mRelativeLayout.setBackgroundColor(mColor);
        mFactButton.setTextColor(mColor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        //Assign Views from layout file to corresponding variables
        mFactTextView = (TextView) findViewById(R.id.funFactTextext);
        mFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.parent_layout);

        //Define a click handler for Button.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mFact = mFactBook.getFact();
                mColor = mColorWheel.getColor();

                mFactTextView.setText(mFact);
                mRelativeLayout.setBackgroundColor(mColor);
                mFactButton.setTextColor(mColor);

            }
        };

        mFactButton.setOnClickListener(listener);

//        Toast.makeText(FactsActivity.this, "Yay! Our activity was created.", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"We are logging from the onCreate() of " + TAG);
    }
}
