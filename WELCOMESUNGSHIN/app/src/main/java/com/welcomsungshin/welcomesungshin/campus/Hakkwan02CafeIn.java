package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Hakkwan02CafeIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkwan02_cafe_in);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        finish();
    }


    public void clickedToHakkwan02Cafe(View v) {
        Intent intent = new Intent(this, Hakkwan02Cafe.class);
        startActivity(intent);
        finish();
    }
}
