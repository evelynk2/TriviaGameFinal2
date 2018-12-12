package com.example.evelynkrasnik.triviagamefinal;

import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.evelynkrasnik.mp6.R;

public class WorldHistory extends AppCompatActivity {
    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    int points;
    TextView wrongOrRight;
    TextView pointsCount;
    String category;
    public static TextView questionData;
    public static Button correctAnswerData;
    public static Button wrongAnswerData1;
    public static Button wrongAnswerData2;
    public static Button wrongAnswerData3;



    WorldHistory() {
        points = MainActivity.points;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.world_history);



        addListenerOnButton();


    }
    private void addListenerOnButton() {
        final Context context = this;

        button = (Button) findViewById(R.id.nextButton);
        button1 = (Button) findViewById(R.id.answer1Button);
        button2 = (Button) findViewById(R.id.answer2Button);
        button3 = (Button) findViewById(R.id.answer3Button);
        button4 = (Button) findViewById(R.id.answer4Button);
        wrongOrRight = (TextView) findViewById(R.id.textView7);
        pointsCount = (TextView) findViewById(R.id.pointsLabel);
        pointsCount.setText("Points: " + points);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Activity2.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                button1.setBackgroundColor(Color.RED);
                wrongOrRight.setText("You're Wrong!");
                pointsCount.setText("Points: " + points);

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                button2.setBackgroundColor(Color.RED);
                wrongOrRight.setText("You're Wrong!");
                pointsCount.setText("Points: " + points);

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                button3.setBackgroundColor(Color.RED);
                wrongOrRight.setText("You're Wrong!");
                pointsCount.setText("Points: " + points);

                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                button4.setBackgroundColor(Color.GREEN);
                wrongOrRight.setText("You're Right!");
                MainActivity.points++;
                pointsCount.setText("Points: " + MainActivity.points);
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
            }
        });

    }
}
