/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.courtcounter;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;



/**
 * Keeps track of basketball scores for two teams.
 */
public class MainActivity extends AppCompatActivity {

    int scoreForTeamA = 0 ;
    int scoreForTeamB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreForTeamA = 0);
    }

     /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method is called when the 'Free Throw' button is clicked. This button increases the overall score of Team A by 1 point.
     */
    public void freeThrowForTeamA (View view) {
        scoreForTeamA = scoreForTeamA + 1 ;
        displayForTeamA (scoreForTeamA);
    }

    /**
     * This method is called when the '+2 Points' button is clicked. This button increases the overall score of Team A by 2 points.
     */
    public void plusTwoForTeamA (View view) {
        scoreForTeamA = scoreForTeamA + 2 ;
        displayForTeamA (scoreForTeamA);
    }

    /**
     * This method is called when the '+3 Points' button is clicked. This button increases the overall score of Team A by 3 points.
     */

    public void plusThreeForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 3 ;
        displayForTeamA (scoreForTeamA) ;
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when the 'Free Throw' button is clicked. This button increases the overall score of Team B by 1 point.
     */
    public void freeThrowForTeamB (View view) {
        scoreForTeamB = scoreForTeamB + 1 ;
        displayForTeamB (scoreForTeamB) ;
    }

    /**
     * This method is called when the '+2 Points' button is clicked. This button increases the overall score of Team B by 2 points.
     */

    public void plusTwoForTeamB (View view) {
        scoreForTeamB = scoreForTeamB + 2 ;
        displayForTeamB (scoreForTeamB) ;
    }

    /**
     * This method is called when the '+3 Points' button is clicked. This button increases the overall score of Team B by 3 points.
     */

    public void plusThreeForTeamB (View view) {
        scoreForTeamB = scoreForTeamB + 3 ;
        displayForTeamB (scoreForTeamB) ;
    }

    /**
     * This method is called when the 'RESET' button is clicked. This button resets the score of Team A and Team B to 0, and displays the new scores.
     */

    public void scoreReset (View view) {
        scoreForTeamA = 0 ;
        scoreForTeamB = 0 ;
        displayForTeamA (scoreForTeamA) ;
        displayForTeamB (scoreForTeamB) ;
    }

}