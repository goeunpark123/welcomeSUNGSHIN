package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sungshin03Ele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungshin03_ele);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSungshin04Ele(View v) {
        Intent intent = new Intent(this, Sungshin04Ele.class);
        startActivity(intent);
        finish();
    }

    public void clickedToCloudBridgeFront(View v) {
        Intent intent = new Intent(this, CloudBridgeFront.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSungshin02Ele(View v) {
        Intent intent = new Intent(this,Sungshin02Ele.class);
        startActivity(intent);
        finish();
    }
}
