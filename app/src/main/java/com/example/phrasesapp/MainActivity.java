package com.example.phrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;

    public void play(View view){
        int id = view.getId();
        String ans_id = view.getResources().getResourceEntryName(id);
        int resource_id = getResources().getIdentifier(ans_id, "raw", "com.example.phrasesapp");
        media = MediaPlayer.create(this, resource_id);
        media.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
