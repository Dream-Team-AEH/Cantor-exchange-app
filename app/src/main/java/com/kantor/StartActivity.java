package com.kantor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class StartActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY = 3000; // 3 sekundy

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ImageView logoImageView = findViewById(R.id.logoImageView);

        // przekierowanie do Main Activity
        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(StartActivity.this, MainActivity.class);
            StartActivity.this.startActivity(mainIntent);
            StartActivity.this.finish();
        }, SPLASH_DELAY);
    }
}