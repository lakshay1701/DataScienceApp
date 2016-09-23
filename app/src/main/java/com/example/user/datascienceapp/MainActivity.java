package com.example.user.datascienceapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button story,collect;

    //    static  int count=0;
    // int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        story = (Button) findViewById(R.id.story_button);
        story.setOnClickListener(this);
        collect = (Button) findViewById(R.id.collect_button);
        collect.setOnClickListener(this);


    }

    public void onClick(View w) {
        switch (w.getId()) {
            case R.id.story_button:
                Intent next = new Intent(MainActivity.this, Slider_activity.class);
                startActivity(next);
                break;
            case R.id.collect_button:
                Intent next1 = new Intent(MainActivity.this, collect_data_activity.class);
                startActivity(next1);
                break;

        }


    }


}
