package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sujung05Ele_A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung05_ele_);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSujung10Ele_C(View v) {
        Intent intent = new Intent(this, Sujung10Ele_C.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSujung05Study_A(View v) {
        Intent intent = new Intent(this, Sujung05Study_A.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSujung04Ele_C(View v) {
        Intent intent = new Intent(this, Sujung04Ele_C.class);
        startActivity(intent);
        finish();
    }
}
