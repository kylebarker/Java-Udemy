package com.kylebarker;

public class Main {

    public static void main(String[] args) {
	    int highScore = calculateScore(true, 800,5, 100);
		System.out.println("Your final score was " + highScore);

	    boolean gameOver = true;
	    int score = 400;
	    int levelCompleted = 8;
	    int bonus = 200;
	    highScore = calculateScore(	gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		// Create a method called displayHighScorePosition
		// it should a players name a paramer, and a 2nd parameter as a position in the high score table
		// You should display the players name along with a message like " managed to get into position " and the
		// position they got and a further message " on the high score table".
		//
		// Create a 2nd method called calculate calculateHighScorePosition
		// it should be sent one argument only, the player score
		// it should return an int
		// the return data should be
		// 1 if the score is > 1000
		// 2 if the score is > 500 and < 1000
		// 3 if the score is > 100 and < 500
		// 4 in all other cases
		// call both methods and display the results of the following
		// a score of 1500, 900, 400, and 50

		int highScorePosition = calculateHighScorePosition(score);
		displayHighScorePosition("Kyle", highScorePosition);

		highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Kyle", highScorePosition);

		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Kyle", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Kyle", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Kyle", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition){
		System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
	}

	public static int calculateHighScorePosition(int score) {
    	if(score > 1000){
    		return 1;
		} else if (score >= 500 && score < 1000) {
    		return 2;
		} else if (score >= 100 && score < 500) {
    		return 3;
		} else {
    		return 4;
		}
	}

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return  finalScore;
		}

		return -1;
	}

}
