package com.example.ggavi.ahn;


import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;


public class NUM4_RunActivity extends AppCompatActivity {

    // timer
    private Chronometer mChronometer;

    // click
    TextView tv_clicks;
    Button b_click;
    int clicks = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num4_activity_run);

        // ActionBar Hide!
        getSupportActionBar().hide();

        // timer
        mChronometer = (Chronometer) findViewById(R.id.chronometer_view);  // timer layout
        mChronometer.setBase(SystemClock.elapsedRealtime());  // timer = 0:00;
        mChronometer.start();                                 // timer start
        //////////////////////////////////////////////////////////////////////////////////



        // click Button
        b_click = (Button) findViewById(R.id.b_click);
        tv_clicks = (TextView) findViewById(R.id.tv_clicks);

        b_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;
                tv_clicks.setText("" + clicks);
            }
        });



        // NEXT Button (NUM4 -> NUM1) : Next Day
        Button b2 = (Button)findViewById(R.id.NextDayButton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM1_MainPopActivity.class);

                finish();                         // end NUM2 screen
                startActivity(intent);            // move NUM4 screen
            }
        });
    }   // end onCreate()
}   // end MainActivity