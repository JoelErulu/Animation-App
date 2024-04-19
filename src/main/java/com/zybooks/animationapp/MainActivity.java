package com.zybooks.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import com.zybooks.animationapp.R;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ImageView imageView2;
    private ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);

        // Create a translation animation that moves the image from off the screen on the right to the left edge of the screen
        Animation animation = new TranslateAnimation(2000, -2000, 0, 0);
        animation.setDuration(3000); // Set animation duration to 3 seconds
        animation.setFillAfter(true); // Maintain the final position of the image after animation
        animation.setRepeatCount(Animation.INFINITE); // Repeat the animation infinitely

        Animation animation2 = new TranslateAnimation(2500, -2000, 0, 0);
        animation2.setDuration(5000); // Set animation duration to 5 seconds
        animation2.setFillAfter(true); // Maintain the final position of the image after animation
        animation2.setRepeatCount(Animation.INFINITE); // Repeat the animation infinitely

        Animation animation3 = new TranslateAnimation(3000, -2000, 0, 0);
        animation3.setDuration(4500); // Set animation duration to 4.5 seconds
        animation3.setFillAfter(true); // Maintain the final position of the image after animation
        animation3.setRepeatCount(Animation.INFINITE); // Repeat the animation infinitely

        imageView.startAnimation(animation); // Start the animation
        imageView2.startAnimation(animation2); // Start the animation
        imageView3.startAnimation(animation3); // Start the animation
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.appbar_menu, menu);
        return true;
    }

    public void onAboutClick(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
