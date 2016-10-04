package com.example.user.datascienceapp;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
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
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class collect_data_activity extends AppCompatActivity implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {
    View v;
    Button newq;
    TextView id, name, game;
    CoordinatorLayout snackbarCoordinatorLayout;
    RatingBar ratingBar;
    ImageView rating_image;
    int count = 0;
    int pic_no = 0;
    int j = 2;                //used for checking slide no
    static int numStars = 0;
    ArrayList<DataBean> list1 = new ArrayList<DataBean>();

    @Override
    public void onBackPressed() {
        //do nothing
        //make back button dis-functional
        if (count == 0) {
            snackbarCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.snackbarCoordinatorLayout);
            Snackbar.make(snackbarCoordinatorLayout, "Press again to exit", Snackbar.LENGTH_SHORT).show();
            count++;
        } else {
            finish();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // for (int l = 0; l <= 10; l++) {
        //   DataBean obj = new DataBean();
        // obj.setId(l);
        //obj.setImage(R.drawable.slide1);
        //obj.setGender("Male");
        //obj.setGame("sports");
        //list1.add(obj);
        //}
        setContentView(R.layout.activity_collect_data_activity);
        newq = (Button) findViewById(R.id.button);
        id = (TextView) findViewById(R.id.id);
        name = (TextView) findViewById(R.id.name);
        game = (TextView) findViewById(R.id.game);

        rating_image = (ImageView) findViewById(R.id.rating_image);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setOnRatingBarChangeListener(this);
        newq.setOnClickListener(collect_data_activity.this);
        DataBean ob = new DataBean();
        // ob=list.get(1);
        list1 = create_databean_list.create_list();
        ob = list1.get(pic_no++);
       // gender.setText(ob.getGender());
        game.setText(ob.getGame());
        id.setText("" + ob.getId()+"/"+list1.size());
        name.setText(ob.getName());
        rating_image.setImageResource(R.drawable.rating_pic_1);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:


                float a = ratingBar.getRating();
                if (a == 0) {

                    snackbarCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.snackbarCoordinatorLayout);

                    Snackbar.make(snackbarCoordinatorLayout, R.string.snack_bar_content, Snackbar.LENGTH_SHORT).show();

                } else {
                    String Tag = "" + a;
                    Log.e(Tag, Tag);
                    if (j <= list1.size()) {
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
                        DataBean ob = new DataBean();

                        ob = list1.get(pic_no++);
                        l.startAnimation(ab);
                        //gender.setText(ob.getGender());
                        game.setText(ob.getGame());
                        id.setText("" + ob.getId()+"/"+list1.size());
                        name.setText(ob.getName());
                        rating_image.setImageResource(ob.getImage());
                        j++;

                    } else {
                        finish();
                    }
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