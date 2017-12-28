package com.matasyan.otheranimatinschallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){

        ImageView bart = findViewById(R.id.bart);
        ImageView homer = findViewById(R.id.homer);

        if (bart.getAlpha() == 1){

            bart.animate().alpha(0f).setDuration(2000);
            homer.animate().alpha(1f).setDuration(2000);
        } else {
            homer.animate().alpha(0f).setDuration(2000);
            bart.animate().alpha(1f).setDuration(2000);
        }



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
