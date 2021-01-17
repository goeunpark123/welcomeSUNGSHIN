package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sungshin04Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungshin04_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSungshin05Ele(View v) {
        Intent intent = new Intent(this, Sungshin05Ele.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSungToSuBridge(View v) {
        Intent intent = new Intent(this, SungToSuBridge.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSungshin03Ele(View v) {
        Intent intent = new Intent(this,Sungshin03Ele.class);
        startActivity(intent);
        finish();
    }
}
