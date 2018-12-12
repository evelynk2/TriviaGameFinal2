package com.example.evelynkrasnik.triviagamefinal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.evelynkrasnik.mp6.R;


public class Activity2 extends AppCompatActivity {


    Button button;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    String category;


    Activity2() {
        super();
    }


    public String getCategory() {
        return category;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;

        button = (Button) findViewById(R.id.scienceButton);
        button1 = (Button) findViewById(R.id.sportsButton);
        button2 = (Button) findViewById(R.id.mythologyButton);
        button3 = (Button) findViewById(R.id.worldhistoryButton);
        button4 = (Button) findViewById(R.id.literatureButton);
        button5 = (Button) findViewById(R.id.musicButton);


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Science.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg1) {
                Intent intent = new Intent(context, Sports.class);
                startActivity(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg2) {

                Intent intent = new Intent(context, Mythology.class);
                startActivity(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg3) {

                Intent intent = new Intent(context, WorldHistory.class);
                startActivity(intent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg4) {
                Intent intent = new Intent(context, Literature.class);
                startActivity(intent);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg5) {
                Intent intent = new Intent(context, Music.class);
                startActivity(intent);

            }
        });
    }


}

