package com.welcomsungshin.welcomesungshin;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Fail extends AppCompatActivity {

    private static MediaPlayer mp;
    Easy easy = (Easy)Easy.Easy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);
        easy.finish();

        mp = MediaPlayer.create(this, R.raw.failb);
        mp.start();
    }

    public void clickedToHangman(View v) {
        Intent intent = new Intent(this, GameLevel.class);
        startActivity(intent);
        mp.stop();
        finish();
    }
}
