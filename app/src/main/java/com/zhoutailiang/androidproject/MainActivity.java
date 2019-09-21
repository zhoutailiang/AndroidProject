package com.zhoutailiang.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.zhoutailiang.androidproject.constraintlayout.ConstraintLayoutActivity;
import com.zhoutailiang.androidproject.motionlayout.ArcMotionActivity;
import com.zhoutailiang.androidproject.motionlayout.KeyFrameActivity;
import com.zhoutailiang.androidproject.motionlayout.MotionLayoutActivity;
import com.zhoutailiang.androidproject.motionlayout.MotionLayoutConstraintSetActivity;
import com.zhoutailiang.androidproject.transitionanimation.ConstraintSetActivity;
import com.zhoutailiang.androidproject.transitionanimation.SceneAnimationActivity;
import com.zhoutailiang.androidproject.transitionanimation.TransitionAnimationActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_constraint_layout).setOnClickListener(this);
        findViewById(R.id.tv_text_dance).setOnClickListener(this);
        findViewById(R.id.tv_object_animator).setOnClickListener(this);
        findViewById(R.id.tv_transition_animation).setOnClickListener(this);
        findViewById(R.id.tv_transition_animation).setOnClickListener(this);
        findViewById(R.id.tv_begin_animation).setOnClickListener(this);
        findViewById(R.id.tv_go_animation).setOnClickListener(this);
        findViewById(R.id.tv_motion_layout).setOnClickListener(this);
        findViewById(R.id.tv_motion_layout_constraint_set).setOnClickListener(this);
        findViewById(R.id.tv_key_frame).setOnClickListener(this);
        findViewById(R.id.tv_arc_motion).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.tv_constraint_layout:
                startPage(ConstraintLayoutActivity.class);
                break;
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
            case R.id.tv_transition_animation:
                startPage(TransitionAnimationActivity.class);
                break;
            case R.id.tv_begin_animation:
                startPage(ConstraintSetActivity.class);
                break;
            case R.id.tv_go_animation:
                startPage(SceneAnimationActivity.class);
                break;
            case R.id.tv_arc_motion:
                startPage(ArcMotionActivity.class);
                break;
        }
    }

    private void startPage(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
