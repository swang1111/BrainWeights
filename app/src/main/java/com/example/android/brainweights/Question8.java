package com.example.android.brainweights;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Question8 extends AppCompatActivity {
    boolean right = false;
    boolean isNotDone = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);

        Button one = (Button) findViewById(R.id.next_button);
        one.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                if (right){
                    Intent oneIntent = new Intent(Question8.this, Question9.class);
                    startActivity(oneIntent);
                }
            }
        });


    }

    public void showHint(View view) {
        Toast.makeText(Question8.this, "It is a real word!", Toast.LENGTH_SHORT).show();
    }

    public void submitAnswer(View view) {
        EditText rightAnswer = (EditText) findViewById(R.id.edittext);
        String isRightAnswer = rightAnswer.getText().toString();

        if (isRightAnswer.equals("con")) {
            right = true;
            if (isNotDone) {
                MainActivity.count++;
                isNotDone = false;
            }
            Toast.makeText(Question8.this, "Correct! Press next to continue.", Toast.LENGTH_SHORT).show();
        }
        else {
            isNotDone = false;
            right = true;
            Toast.makeText(Question8.this, "Wrong! The correct answer is con. Press next to continue. ", Toast.LENGTH_SHORT).show();
        }
    }

}
