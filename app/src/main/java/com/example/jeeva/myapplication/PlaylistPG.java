package com.example.jeeva.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;


    public class PlaylistPG extends MainActivity {

        ArrayList<Integer> values = new ArrayList<Integer>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.last);
            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://open.spotify.com/playlist/0qV7cifmtxPPS7Xi0POPyr"));
            startActivity(browserIntent);
        }

    }
