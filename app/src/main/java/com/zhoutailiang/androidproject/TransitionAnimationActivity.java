package com.zhoutailiang.androidproject;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TransitionAnimationActivity extends AppCompatActivity {
    private ViewGroup mRoot;
    private View mView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_animation);
        mRoot = findViewById(R.id.root);
        mView = findViewById(R.id.view);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(mRoot);
                FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) mView.getLayoutParams();
                params.gravity = Gravity.END;
//                params.gravity = Gravity.CENTER;
//                params.width *=2;
//                params.height *=2;
                mView.setLayoutParams(params);
            }
        });
    }
}
