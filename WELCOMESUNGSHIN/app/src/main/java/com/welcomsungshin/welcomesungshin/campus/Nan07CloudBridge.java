package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Nan07CloudBridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan07_cloud_bridge);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToCloudBridgeFront(View v) {
        Intent intent = new Intent(this, CloudBridgeFront.class);
        startActivity(intent);
        finish();
    }


    public void clickedToNan07Ele(View v) {
        Intent intent = new Intent(this, Nan07Ele.class);
        startActivity(intent);
        finish();
    }
}
