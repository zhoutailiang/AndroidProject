package com.zhoutailiang.androidproject.transitionanimation;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.zhoutailiang.androidproject.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class SceneAnimationActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean mToggle = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_animation);
        bindData();
    }

    private void bindData() {
        findViewById(R.id.image_film_cover).setOnClickListener(this);

        RatingBar ratingBar = findViewById(R.id.rating_film_rating);
        ratingBar.setRating(4.5f);

        TextView filmTitle = findViewById(R.id.text_film_title);
        filmTitle.setText(R.string.film_title);

        TextView filmDescription = findViewById(R.id.text_film_description);
        filmDescription.setText(R.string.film_description);

    }

    @Override
    public void onClick(View view) {
        ConstraintLayout root = findViewById(R.id.root);
        Scene startScene = Scene.getSceneForLayout(root, R.layout.go_start, this);
        Scene endScene = Scene.getSceneForLayout(root, R.layout.go_end, this);
        if (mToggle) {
            TransitionManager.go(endScene);
        } else {
            TransitionManager.go(startScene);
        }
        bindData();
        mToggle = !mToggle;
    }
}
