package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sujung01Bluepot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung01_bluepot);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSujung01Ele(View v) {
        Intent intent = new Intent(this, Sujung01.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSujung01Print(View v) {
        Intent intent = new Intent(this, Sujung01Print.class);
        startActivity(intent);
        finish();
    }
}
