package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Hakkwan04Cafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkwan04_cafe);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToHakkwan04CafeIn(View v) {
        Intent intent = new Intent(this, Hakkwan04CafeIn.class);
        startActivity(intent);
        finish();
    }


    public void clickedToNanhyangkwan(View v) {
        Intent intent = new Intent(this, Nanhyangkwan.class);
        startActivity(intent);
        finish();
    }

    public void clickedToHakkwan02Cafe(View v) {
        Intent intent = new Intent(this, Hakkwan02Cafe.class);
        startActivity(intent);
        finish();
    }
}
