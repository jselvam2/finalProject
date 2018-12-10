package com.example.jeeva.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private static HashMap<String,String> Playlists =new HashMap<String, String>();

    private static int edm = 0;
    private static int happy = 0;
    private static int pop = 0;
    private static int sad = 0;
    private static int oldies = 0;

    public static HashMap<String,String> getPlaylists() {
        return Playlists;
    }

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
        Playlists.put("edm", "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr");  // replace these links with the
        Playlists.put("happy", "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr");// corresponding correct link. The
        Playlists.put("pop", "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr");  // link I have right now is the tester link
        Playlists.put("sad", "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr");  //               |
        Playlists.put("oldies", "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr");//            <--
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
