package com.example.android.brainweights;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question10 extends AppCompatActivity {
    boolean right = false;
    boolean isNotDone = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question10);

        Button one = (Button) findViewById(R.id.next_button);
        one.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                if (right){
                    Intent oneIntent = new Intent(Question10.this, Question11.class);
                    startActivity(oneIntent);
                }
            }
        });


    }

    public void showHint(View view) {
        Toast.makeText(Question10.this, "Why are all the walls facing south?", Toast.LENGTH_SHORT).show();
    }

    public void submitAnswer(View view) {
        RadioButton rightAnswer = (RadioButton) findViewById(R.id.radio1);
        boolean isRightAnswer = rightAnswer.isChecked();

        if (isRightAnswer) {
            right = true;
            if (isNotDone) {
                MainActivity.count++;
                isNotDone = false;
            }
            Toast.makeText(Question10.this, "Correct! Press next to continue.", Toast.LENGTH_SHORT).show();
        }
        else {
            isNotDone = false;
            right = true;
            Toast.makeText(Question10.this, "Wrong! The correct answer is White. Press next to continue. ", Toast.LENGTH_SHORT).show();
        }
    }

}
