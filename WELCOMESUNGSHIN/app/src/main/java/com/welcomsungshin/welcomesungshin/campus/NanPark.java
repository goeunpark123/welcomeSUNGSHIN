package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class NanPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nan_park);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }


    public void clickedToNan03Ele(View v) {
        Intent intent = new Intent(this, Nan03Ele.class);
        startActivity(intent);
        finish();
    }

    public void clickedToNanParkToArt1(View v) {
        Intent intent = new Intent(this, NanParkToArt1.class);
        startActivity(intent);
        finish();
    }

    public void clickedToNanToSungshin(View v) {
        Intent intent = new Intent(this, NanToSungshin.class);
        startActivity(intent);
        finish();
    }
}
