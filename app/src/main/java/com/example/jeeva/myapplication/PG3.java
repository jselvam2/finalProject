package com.example.jeeva.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PG3 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);

        Button A = findViewById(R.id.ageA);
        Button B = findViewById(R.id.ageB);
        Button C = findViewById(R.id.ageC);
        Button D = findViewById(R.id.ageD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm() + 1);
                setHappy(getHappy() + 1);
                setPop(getPop() + 1);
                setOldies(getOldies() - 1);
                startActivity(new Intent(getApplicationContext(), PG4.class));
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy() + 1);
                startActivity(new Intent(getApplicationContext(), PG4.class));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPop(getPop() - 1);
                setEdm(getEdm() - 1);
                startActivity(new Intent(getApplicationContext(), PG4.class));
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOldies(getOldies() + 5);
                setEdm(getEdm() - 2);
                setPop(getPop() - 2);
                startActivity(new Intent(getApplicationContext(), PG4.class));
            }
        });

    }
}
