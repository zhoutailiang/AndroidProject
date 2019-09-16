package com.zhoutailiang.androidproject;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ObjectAnimatorActivity extends AppCompatActivity {
    private View mRoot;
    private View mView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animator);
        mRoot = findViewById(R.id.root);
        mView = findViewById(R.id.view);
        mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int distance = mRoot.getWidth() - mView.getWidth();
                mView.animate().translationX(distance).start();
            }
        });
    }
}
