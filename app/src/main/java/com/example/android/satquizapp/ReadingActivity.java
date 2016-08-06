package com.example.android.satquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ReadingActivity extends AppCompatActivity {

    int readScore = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
    }


    public void displayForMath (int score) {
        TextView scoreView = (TextView) findViewById(R.id.read_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radio3:
                if (checked)
                    // Ninjas rule
                    readScore = readScore + 1;
                break;
            case R.id.radio4:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void onRadioButtonClicked2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio5:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio6:
                if (checked)
                    // Ninjas rule
                    readScore = readScore + 1;
                break;
            case R.id.radio7:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radio8:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }

    public void onRadioButtonClicked3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio9:
                if (checked)
                    // Pirates are the best

                break;
            case R.id.radio10:
                if (checked)
                    // Ninjas rule

                    break;
            case R.id.radio11:
                if (checked)
                    // Ninjas rule
                    readScore = readScore + 1;
                    break;
            case R.id.radio12:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }



    public void resetScores(View view){
        readScore = 0;
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.group1);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.group2);
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.group3);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        display(readScore);
    }


    public void submitScores(View view){
        display(readScore);
        if (readScore == 3) {
            Toast.makeText(getApplicationContext(), "Awesome! You scored 100%", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "try harder", Toast.LENGTH_SHORT).show();
        }

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.read_score);
        quantityTextView.setText("" + number);
    }
}
