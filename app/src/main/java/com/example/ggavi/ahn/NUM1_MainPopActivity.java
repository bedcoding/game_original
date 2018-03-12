package com.example.ggavi.ahn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NUM1_MainPopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num1_activity_main_pop);





        // NEXT Button (NUM1 -> NUM2)
        Button b = (Button)findViewById(R.id.nextDayButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM2_MainActivity.class);
                        finish();                 // end NUM1 screen
                startActivity(intent);            // move NUM2 screen
            }
        });

    }   // end onCreate()
}   // end MainActivity