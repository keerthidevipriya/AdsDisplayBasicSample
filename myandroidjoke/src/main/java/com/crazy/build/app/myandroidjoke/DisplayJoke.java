package com.crazy.build.app.myandroidjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    TextView displayjoketextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        displayjoketextView = findViewById(R.id.id_joke_display_second);
        String jokeText = getIntent().getStringExtra("JokeKey");
        displayjoketextView.setText(jokeText);
    }
}
