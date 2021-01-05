package com.welcomsungshin.welcomesungshin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Explain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explain);
    }

    public void clickedToMain(View v) {
        finish();
    }
}
