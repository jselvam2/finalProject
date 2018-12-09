package com.example.jeeva.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PG2 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);

        Button A = findViewById(R.id.genreA);
        Button B = findViewById(R.id.genreB);
        Button C = findViewById(R.id.genreC);
        Button D = findViewById(R.id.genreD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm() + 1);
                setHappy(getHappy() + 1);
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy() + 1);
                setSad(getSad() + 1);
                setOldies(getOldies() + 1);
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPop(getPop() + 2);
                setOldies(getOldies() - 1);
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm() + 5);
                setOldies(getOldies() - 1);
                setPop(getPop() - 1);
                setSad(getSad() - 1);
                setHappy(getHappy() - 1);
                startActivity(new Intent(getApplicationContext(), PG3.class));
            }
        });


    }

}
