package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button shakeButton;
        shakeButton = (Button) findViewById(R.id.shake_button);
        ImageView ballImage = (ImageView) findViewById(R.id.ball_image);
        int [] magicImage = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };

        shakeButton.setOnClickListener(view -> {
            Log.d("Magic-8","Shake Shake Shake!");
            Random randomNumber = new Random();

            int number = randomNumber.nextInt(4);
            ballImage.setImageResource(magicImage[number]);
        });







    }


}
