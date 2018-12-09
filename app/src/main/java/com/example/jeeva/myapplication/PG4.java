package com.example.jeeva.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PG4 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);

        Button A = findViewById(R.id.moodA);
        Button B = findViewById(R.id.moodB);
        Button C = findViewById(R.id.moodC);
        Button D = findViewById(R.id.moodD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy() + 1);
                setPop(getPop() + 1);
                setEdm(getEdm() + 1);
                setSad(getSad() - 1);
                startActivity(new Intent(getApplicationContext(), PG5.class));
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setSad(getSad() + 2);
                setHappy(getHappy() - 1);
                setHappy(getHappy() - 1);
                setEdm(getEdm() - 1);
                setPop(getPop() - 1);
                startActivity(new Intent(getApplicationContext(), PG5.class));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm() + 2);
                setSad(getSad() - 2);
                setPop(getPop() - 1);
                setOldies(getOldies() - 1);
                startActivity(new Intent(getApplicationContext(), PG5.class));
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy() + 2);
                setEdm(getEdm() - 2);
                startActivity(new Intent(getApplicationContext(), PG5.class));
            }
        });

    }
}
