package com.example.user.datascienceapp;

import android.content.DialogInterface;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class collect_data_activity extends AppCompatActivity implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {
    View v;
    Button newq;
    TextView qno, ques;
    CoordinatorLayout snackbarCoordinatorLayout;
    RatingBar ratingBar;
    int count = 0;
    static int numStars = 0;

    @Override
    public void onBackPressed() {
        //do nothing
        //make back button dis-functional
        if (count == 0) {
            snackbarCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.snackbarCoordinatorLayout);
            Snackbar.make(snackbarCoordinatorLayout, "Press again to exit", Snackbar.LENGTH_LONG).show();
            count++;
        } else {
            finish();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_data_activity);
        newq = (Button) findViewById(R.id.button);
        qno = (TextView) findViewById(R.id.number);
        ques = (TextView) findViewById(R.id.name);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(this);
        newq.setOnClickListener(collect_data_activity.this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:


                float a = ratingBar.getRating();
                if (a == 0) {

                    snackbarCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.snackbarCoordinatorLayout);
                    Snackbar.make(snackbarCoordinatorLayout, "You cannot move to next picture without giving rating", Snackbar.LENGTH_LONG).show();
                } else {
                    String Tag = "" + a;
                    Log.e(Tag, Tag);
                   // Toast.makeText(this, Tag, Toast.LENGTH_SHORT).show();
                    ratingBar.setRating(0);

                    final View l = findViewById(R.id.main);
                    Animation ab = AnimationUtils.loadAnimation(
                           collect_data_activity.this, R.anim.blink);
                    ab.setDuration(3500);
                    ab.setAnimationListener(new Animation.AnimationListener() {

                        public void onAnimationEnd(Animation animation) {
                            // Do what ever you need, if not remove it.
                        }

                        public void onAnimationRepeat(Animation animation) {
                            // Do what ever you need, if not remove it.
                        }

                        public void onAnimationStart(Animation animation) {
                            // Do what ever you need, if not remove it.
                        }

                    });
                    l.startAnimation(ab);
                    ques.setText("aaa");
                    qno.setText("122");
                }
                break;
        }
    }

    /**
     * Notification that the rating has changed.
     *
     * @see android.widget.RatingBar.OnRatingBarChangeListener#onRatingChanged(android.widget.RatingBar,
     * float, boolean)
     */
    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating,
                                boolean fromTouch) {
        //do nothing

    }


}