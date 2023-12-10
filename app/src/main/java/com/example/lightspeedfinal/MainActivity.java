package com.example.lightspeedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayPressed(View view) {
        Intent myIntent=new Intent(getBaseContext(),Tutorial.class);
        startActivity(myIntent);
    }

    public void onTutorialPressed(View view) {
        Intent myIntent=new Intent(getBaseContext(),Tutorial.class);
        startActivity(myIntent);
    }

    public void onLeaderboardPressed(View view) {
        Intent myIntent=new Intent(getBaseContext(),Tutorial.class);
        startActivity(myIntent);
    }
}