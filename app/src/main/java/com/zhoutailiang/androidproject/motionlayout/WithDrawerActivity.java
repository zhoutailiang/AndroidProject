package com.zhoutailiang.androidproject.motionlayout;

import android.os.Bundle;
import android.view.View;

import com.zhoutailiang.androidproject.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.drawerlayout.widget.DrawerLayout;

/**
 * Created by zhoutailiang on 2019-09-22
 */
public class WithDrawerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_drawer);
        final MotionLayout motionLayout = findViewById(R.id.motion_layout);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                motionLayout.setProgress(slideOffset);
            }
        });

    }
}
