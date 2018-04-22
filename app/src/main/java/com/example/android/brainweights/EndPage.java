package com.example.android.brainweights;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EndPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);
        display(MainActivity.count);
    }

    public void display(int score) {
        TextView scoreView = (TextView) findViewById(R.id.end);
        scoreView.setText(String.valueOf(score) + "/12");
    }


}
