package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class Sungshin05Suharu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sungshin05_suharu);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSungshin05Ele(View v) {
        Intent intent = new Intent(this, Sungshin05Ele.class);
        startActivity(intent);
        finish();
    }

}
