package com.example.android.hotpotatosportsball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int potatoHeatAccumulated = 0;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Team A*/
    public void addThreeTeamA(View v){
        potatoHeatAccumulated = potatoHeatAccumulated + 3;
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoTeamA(View v){
        potatoHeatAccumulated = potatoHeatAccumulated + 2;
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowTeamA(View v){
        potatoHeatAccumulated++;
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        DisplayPotatoHeatAccumulated(potatoHeatAccumulated);
    }

    /*
    * Team B */
    public void addThreeTeamB(View v){
        potatoHeatAccumulated = potatoHeatAccumulated + 3;
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoTeamB(View v){
        potatoHeatAccumulated = potatoHeatAccumulated + 2;
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowTeamB(View v){
        potatoHeatAccumulated++;
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
        DisplayPotatoHeatAccumulated(potatoHeatAccumulated);
    }

    public void DisplayPotatoHeatAccumulated(int seconds){
        TextView secondsView = (TextView) findViewById(R.id.accumulated_seconds);
        secondsView.setText(String.valueOf(seconds));
    }

    public void reset(View v){
        potatoHeatAccumulated = 0;
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
