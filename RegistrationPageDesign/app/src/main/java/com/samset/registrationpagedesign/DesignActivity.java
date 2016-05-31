package com.samset.registrationpagedesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class DesignActivity extends AppCompatActivity {

    private Intent intent;
    private int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        intent = getIntent();
        id = intent.getIntExtra("id", 0);
        setView(id);

    }

    private void setView(int viewid) {

        switch (viewid) {

            case 0:
                setContentView(R.layout.design_one);
                break;
            case 1:
                setContentView(R.layout.design_two);
                break;
            case 2:
                setContentView(R.layout.design_three);
                break;

            default:
                setContentView(R.layout.design_one);
        }

    }
}
