package com.example.jeeva.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;


public class PlaylistPG extends MainActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            String playlist = "";
            HashMap<String,Integer> type = new HashMap<String, Integer>();
            type.put("edm", getEdm());
            type.put("happy", getHappy());
            type.put("pop", getPop());
            type.put("sad", getSad());
            type.put("oldies", getOldies());
            int maxVal=(Collections.max(type.values()));
            for (Map.Entry<String, Integer> input : type.entrySet()) {
                if (input.getValue() == maxVal) {
                    playlist = input.getKey();
                    break;
                }
            }
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.last);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse(MainActivity.getPlaylists().get(playlist)));
            startActivity(browserIntent);
        }

    }
// "https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr"