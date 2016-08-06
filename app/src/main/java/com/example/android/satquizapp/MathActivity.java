package com.example.android.satquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MathActivity extends AppCompatActivity {

    int mathScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

    public void displayForMath (int score) {
        TextView scoreView = (TextView) findViewById(R.id.math_score);
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
                    mathScore = mathScore + 1;
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
                    mathScore = mathScore + 1;
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
                    mathScore = mathScore + 1;
                    break;
            case R.id.radio10:
                if (checked)
                    // Ninjas rule

                break;
            case R.id.radio11:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radio12:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox check4 = (CheckBox) findViewById(R.id.checkbox4);
        CheckBox check5 = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox check6 = (CheckBox) findViewById(R.id.checkbox6);

        boolean oneCheck = check1.isChecked();
        boolean twoCheck = check2.isChecked();
        boolean threeCheck = check3.isChecked();
        boolean fourCheck = check4.isChecked();
        boolean fiveCheck = check5.isChecked();
        boolean sixCheck = check6.isChecked();

        // http://www.android-examples.com/how-to-get-multiple-checked-checkbox-value-in-android/
        // https://developer.android.com/guide/topics/ui/controls/checkbox.html

        if (!oneCheck && !twoCheck && threeCheck && fourCheck && !fiveCheck && sixCheck) {
            mathScore = mathScore + 1;
        }


    }

    public void submitScores(View view){
        display(mathScore);
        if (mathScore == 4) {
            Toast.makeText(getApplicationContext(), "Awesome! You scored 100%", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "try harder", Toast.LENGTH_SHORT).show();
        }

    }

    public void clearCheckBoxes(){
        CheckBox check1 = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox check3 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox check4 = (CheckBox) findViewById(R.id.checkbox4);
        CheckBox check5 = (CheckBox) findViewById(R.id.checkbox5);
        CheckBox check6 = (CheckBox) findViewById(R.id.checkbox6);
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        check5.setChecked(false);
        check6.setChecked(false);
    }


    public void clearRadioButtons(){
        RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.group1);
        RadioGroup radioGroup2 = (RadioGroup)findViewById(R.id.group2);
        RadioGroup radioGroup3 = (RadioGroup)findViewById(R.id.group3);
        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
    }

    public void resetScores(View view){
        mathScore = 0;

        clearRadioButtons();
        clearCheckBoxes();

        display(mathScore);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.math_score);
        quantityTextView.setText("" + number);
    }


}
