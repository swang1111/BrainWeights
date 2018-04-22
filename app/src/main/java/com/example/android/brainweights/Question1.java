package com.example.android.brainweights;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Question1 extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

    }

    public void submitAnswer(View view) {
        CheckBox rightAnswer = (CheckBox) findViewById(R.id.checkbox_89188);
        boolean isRightAnswer = rightAnswer.isChecked();
        if (isRightAnswer) {
            Toast.makeText(Question1.this, "Correct! Press next to continue.", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(Question1.this, "Wrong! The correct answer is 89188. Press next to continue. ", Toast.LENGTH_SHORT).show();
        }
    }

}
