package com.example.jeeva.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> responses = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.getStartedButton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                question1();
                startActivity(new Intent(getApplicationContext(),ActivityPG2.class));
            }
        });

        Button A = findViewById(R.id.genreA);
        Button B = findViewById(R.id.genreB);
        Button C = findViewById(R.id.genreC);
        Button D = findViewById(R.id.genreD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
    }

    public void question1() {

        Intent intent = new Intent(this, ActivityPG2.class);
        startActivity(intent);

    }
}
