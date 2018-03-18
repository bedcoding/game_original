package com.example.ggavi.ahn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NUM1_MainPopActivity extends AppCompatActivity {

    public static int day;
    TextView dayText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num1_activity_main_pop);


        dayText = (TextView) findViewById(R.id.DayTextView);
        dayText.setText("Day " + day);


        // NEXT Button (NUM1 -> NUM2)
        Button b = (Button)findViewById(R.id.nextButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(day < 1)
                {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            NUM2_MainActivity.class); // game progress
                    finish();                         // end NUM1 screen
                    startActivity(intent);            // move NUM2 screen

                    day++;  // day +1;
                }

                else // (day == 1)
                {
                    Intent intent = new Intent(
                            getApplicationContext(),
                            NUM5_EndingVideo.class);  // game ending
                    finish();                         // end NUM1 screen
                    startActivity(intent);            // move NUM5 screen
                }

            }
        });

    }   // end onCreate()
}   // end MainActivity