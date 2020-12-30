package UdemyAcademy;

public class Topic_1 {

	public static void main(String[] args) {
		// a mile is equal to 1.609344 kilometers
		double kilometres = 100 * 1.609344;
		int highScore =50;
		if (highScore == 50) {
			System.out.println("This is an expression");
		}
    
		boolean gameOver =true;
		int score = 5000;
		int levelCompleted =5;
		int bonus = 100;
		calculateScore(true, 5000, 5, 500);
		
		if (score < 5000 && score > 1000) {
			System.out.println("Your score was 5000");
		}else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		}else {
			System.out.println("Got there");
		}
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			System.out.println("Your final score is " + finalScore);
			}
		/*boolean newGameOver = true;
		int secondScore =1000;
		int levelCompleted2 = 8;
		int bonus2 = 200;
		if (newGameOver) {
			int finalSecondScore = secondScore + (levelCompleted2 *bonus2);
			System.out.println("Your Second final Score is" + finalSecondScore);
		}*/
		
		 score = 1000;
		levelCompleted = 8;
		bonus = 200;
		if (gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=1000;
			System.out.println("Your final score is " + finalScore);
			}
		}
// method
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		/*boolean gameOver =true;
		int score = 5000;
		int levelCompleted =5;
		int bonus = 100;
			if (gameOver == true) {
				int finalScore = score + (levelCompleted * bonus);
				finalScore+=1000;
				System.out.println("Your final score is " + finalScore);*/
	}
}
}