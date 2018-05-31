package com.example.bhagi.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void updateScoreA(int value) {
        TextView team_a_score_txt_view = findViewById(R.id.team_a_score);
        team_a_score_txt_view.setText(String.valueOf(value));
    }

    public void threePointsA(View v) {
        score_a += 3;
        updateScoreA(score_a); }

    public void twoPointsA(View v) {
        score_a += 2;
        updateScoreA(score_a); }

    public void onePointA(View v) {
        score_a += 1;
        updateScoreA(score_a); }

    public void foulA(View v) {
        score_b += 2;
        updateScoreB(score_b); }

    public void updateScoreB(int valueB) {
        TextView team_b_score_txt_view = findViewById(R.id.team_b_score);
        team_b_score_txt_view.setText(String.valueOf(valueB)); }

    public void threePointB(View v) {
        score_b += 3;
        updateScoreB(score_b); }

    public void twoPointsB(View v) {
        score_b += 2;
        updateScoreB(score_b); }

    public void onePointB(View v) {
        score_b += 1;
        updateScoreB(score_b); }

    public void foulB(View v) {
        score_a += 2;
        updateScoreA(score_a); }

    public void resetButton(View v) {
        score_a = 0;
        score_b = 0;
        updateScoreA(score_a);
        updateScoreB(score_b); }
}
