package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sujung10Ele_C extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujung10_ele__c);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSujung10StuRes(View v) {
        Intent intent = new Intent(this, Sujung10StuRes.class);
        startActivity(intent);
        finish();
    }


    public void clickedToSujung05Ele_A(View v) {
        Intent intent = new Intent(this, Sujung05Study_A.class);
        startActivity(intent);
        finish();
    }
}
