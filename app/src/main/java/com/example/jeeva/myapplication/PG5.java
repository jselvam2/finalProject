package com.example.jeeva.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PG5 extends MainActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);

        Button A = findViewById(R.id.whereA);
        Button B = findViewById(R.id.whereB);
        Button C = findViewById(R.id.whereC);
        Button D = findViewById(R.id.whereD);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm() + 1);
                startActivity(new Intent(getApplicationContext(), PG6.class));
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy()+1);
                setSad(getSad()+1);
                setPop(getPop()+1);
                setOldies(getOldies()+1);
                startActivity(new Intent(getApplicationContext(), PG6.class));
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setHappy(getHappy()+1);
                setSad(getSad()+1);
                startActivity(new Intent(getApplicationContext(), PG6.class));
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setEdm(getEdm()+1);
                setPop(getPop()+1);
                startActivity(new Intent(getApplicationContext(), PG6.class));
            }
        });

    }
}
