package com.example.codeclan.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void onButtonClick(View view){
        String userInput = getResources().getResourceName(view.getId());
        Log.d("user input is", userInput);

        GameLogic gameLogic = new GameLogic();
        Computer computer = new Computer("bob");
        String computerChoice = computer.randomAnswer();

        String result = gameLogic.play(computerChoice, userInput);



    }


}
