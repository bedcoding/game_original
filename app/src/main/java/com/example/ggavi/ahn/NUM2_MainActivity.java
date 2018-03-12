package com.example.ggavi.ahn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NUM2_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num2_activity_main);




        // NEXT Button (NUM2 -> NUM3)
        Button b = (Button)findViewById(R.id.itemButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM3_Activity_Item.class);

                startActivity(intent);            // move NUM3 screen
            }
        });

        // NEXT Button (NUM2 -> NUM4)
        Button b2 = (Button)findViewById(R.id.runButton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM4_RunActivity.class);
                finish();                         // end NUM2 screen
                startActivity(intent);            // move NUM4 screen
            }
        });

    }   // end onCreate()
}   // end MainActivity