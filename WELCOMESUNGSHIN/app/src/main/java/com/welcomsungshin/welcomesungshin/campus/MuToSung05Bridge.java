package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class MuToSung05Bridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mu_to_sung05_bridge);
        getWindow().setWindowAnimations(0);
    }
    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToMusic(View v) {
        Intent intent = new Intent(this, Emakkwan.class);
        startActivity(intent);
        finish();
    }

    public void clickedToSung05(View v) {
        Intent intent = new Intent(this, Sungshin05Ele.class);
        startActivity(intent);
        finish();
    }
}
