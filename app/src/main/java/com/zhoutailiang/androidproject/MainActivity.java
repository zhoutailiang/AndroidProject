package com.zhoutailiang.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private View mMotionLayout;
    private View mMotionLayoutConstraintSet;
    private View mKeyFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMotionLayout = findViewById(R.id.tv_motion_layout);
        mMotionLayoutConstraintSet = findViewById(R.id.tv_motion_layout_constraint_set);
        mKeyFrame = findViewById(R.id.tv_key_frame);
        mMotionLayout.setOnClickListener(this);
        mMotionLayoutConstraintSet.setOnClickListener(this);
        mKeyFrame.setOnClickListener(this);





        findViewById(R.id.tv_text_dance).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tv_motion_layout:
                startPage(MotionLayoutActivity.class);
                break;
            case R.id.tv_motion_layout_constraint_set:
                startPage(MotionLayoutConstraintSetActivity.class);
                break;
            case R.id.tv_key_frame:
                startPage(KeyFrameActivity.class);
                break;




            case R.id.tv_text_dance:
                startPage(TextDanceActivity.class);
                break;
        }
    }

    private void startPage(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
