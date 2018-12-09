package com.example.jeeva.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> responses = new ArrayList<>();
    private static int edm = 0;
    private static int happy = 0;
    private static int pop = 0;
    private static int sad = 0;
    private static int oldies = 0;

    public int getEdm() {
        return edm;
    }
    public int getHappy() {
        return happy;
    }
    public int getPop() {
        return pop;
    }
    public int getSad() {
        return sad;
    }

    public int getOldies() {
        return oldies;
    }
    public void setEdm(int setEdm) {
        edm = setEdm;
    }
    public void setHappy(int setHappy) {
        happy = setHappy;
    }

    public static void setPop(int setPop) {
        pop = setPop;
    }
    public void setSad(int setSad) {
        sad = setSad;
    }
    public void setOldies(int setOldies) {
        oldies = setOldies;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.getStartedButton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PG2.class));
            }
        });
    }
}
