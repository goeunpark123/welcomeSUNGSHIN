package com.welcomsungshin.welcomesungshin.campus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.welcomsungshin.welcomesungshin.R;

public class SungToSuBridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sung_to_su_bridge);
        getWindow().setWindowAnimations(0);
    }

    public void clickedToSchoolMap(View v) {
        finish();
    }

    public void clickedToSujung04Ele_C(View v) {
        Intent intent = new Intent(this, Sujung04Ele_C.class);
        startActivity(intent);
        finish();
    }


    public void clickedToSungshin04Ele(View v) {
        Intent intent = new Intent(this,Sungshin04Ele.class);
        startActivity(intent);
        finish();
    }
}
