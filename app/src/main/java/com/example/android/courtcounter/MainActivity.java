package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreWater = 0;
    int scoreJuice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForWater(0);
    }

    /**
     * Displays the given score for Team A (Water).
     */

    public void displayForWater(int score) {
        TextView scoreView = (TextView) findViewById(R.id.water_score);
        scoreView.setText(String.valueOf(score) + " ml");
    }

    public void plus250mlWater(View v) {
        scoreWater = scoreWater + 250;
        displayForWater(scoreWater);
    }

    public void plus350mlWater(View v) {
        scoreWater = scoreWater + 350;
        displayForWater(scoreWater);
    }

    public void plus500mlWater(View v) {
        scoreWater = scoreWater + 500;
        displayForWater(scoreWater);
    }

    /**
     * Displays the given score for Team B (Juice).
     */

    public void displayForJuice(int score) {
        TextView scoreView = (TextView) findViewById(R.id.juice_score);
        scoreView.setText(String.valueOf(score) + " ml");
    }

    public void plus250mlJuice(View v) {
        scoreJuice = scoreJuice + 250;
        displayForJuice(scoreJuice);

    }

    public void plus350mlJuice(View v) {
        scoreJuice = scoreJuice + 350;
        displayForJuice(scoreJuice);
    }

    public void plus500mlJuice(View v) {
        scoreJuice = scoreJuice + 500;
        displayForJuice(scoreJuice);
    }

// RESET button:

    public void resetBoth(View v) {
        scoreJuice = 0;
        scoreWater = 0;
        displayForJuice(scoreJuice);
        displayForWater(scoreWater);
    }

}
