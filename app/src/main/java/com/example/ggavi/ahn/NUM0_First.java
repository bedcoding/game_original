package com.example.ggavi.ahn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NUM0_First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num0_activity_first);

        // ActionBar Hide!
        getSupportActionBar().hide();



        // Button1 new game
        /*
        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM1_MainPopActivity.class);

                finish();                         // end NUM0 screen
                startActivity(intent);            // move NUM1 screen
            }
        });
        */



        // Button2 Play saved game (NUM0 -> NUM1)
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        NUM1_MainPopActivity.class);

                finish();                         // end NUM0 screen
                startActivity(intent);            // move NUM1 screen
            }
        });


    }
}
