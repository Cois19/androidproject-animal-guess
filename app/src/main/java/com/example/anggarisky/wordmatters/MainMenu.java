package com.example.anggarisky.wordmatters;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    private TextView textScreen, textTitle;
    private Animation smalltobig;
    private ImageView bigboss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/FredokaOneRegular.ttf");
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);

        textScreen = findViewById(R.id.textScreen);
        textTitle = findViewById(R.id.textTitle);
        bigboss = findViewById(R.id.bigboss);

        textScreen.setTypeface(typeface);
        textTitle.setTypeface(typeface);
        bigboss.startAnimation(smalltobig);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainMenu.this, MainActivity.class);
        startActivity(intent);
    }
}