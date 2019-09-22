package com.zhoutailiang.androidproject.example;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.zhoutailiang.androidproject.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

/**
 * Created by zhoutailiang on 2019-09-21
 */
public class CircularPositioningActivity extends AppCompatActivity {
    private View earth;
    private View moon;
    private View sun;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_positioning);

        earth = findViewById(R.id.earth);
        moon = findViewById(R.id.moon);
        sun = findViewById(R.id.sun);

        LinearInterpolator interpolator = new LinearInterpolator();

        final ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1f);
        valueAnimator.setDuration(10000);
        valueAnimator.setInterpolator(interpolator);
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);



        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {

                ConstraintLayout.LayoutParams earthLayoutParams = (ConstraintLayout.LayoutParams) earth.getLayoutParams();
                earthLayoutParams.circleAngle = 45 + animation.getAnimatedFraction() * 360;

                ConstraintLayout.LayoutParams moonLayoutParams = (ConstraintLayout.LayoutParams) moon.getLayoutParams();
                moonLayoutParams.circleAngle = 270 + animation.getAnimatedFraction() * 360;
                sun.requestLayout();
            }
        });



        sun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueAnimator.start();
            }
        });
    }

}
