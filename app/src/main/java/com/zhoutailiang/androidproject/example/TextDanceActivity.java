package com.zhoutailiang.androidproject.example;

import android.os.Bundle;
import android.view.View;

import com.zhoutailiang.androidproject.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class TextDanceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_dance);
        findViewById(R.id.showDebug).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MotionLayout motionLayout = findViewById(R.id.motionLayout);
                motionLayout.setDebugMode(MotionLayout.DEBUG_SHOW_PATH);
            }
        });
    }
}
