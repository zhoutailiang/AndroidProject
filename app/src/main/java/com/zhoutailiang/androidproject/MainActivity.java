package com.zhoutailiang.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.tv_constraint_layout);
        mConstraintLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tv_constraint_layout:
                startPage(MotionLayoutActivity.class);
                break;
        }
    }

    private void startPage(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
