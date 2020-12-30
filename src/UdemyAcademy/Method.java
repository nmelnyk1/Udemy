package UdemyAcademy;

public class Method {

	public static void main(String[] args) {
		/*boolean gameOver =true;
	    int score = 6000;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore ( gameOver,  score,  levelCompleted,  bonus);
		System.out.println("Your High score was " + highScore);
		calculateScore(true, 6000, 5, 100);
		calculateScore(true, 5620, 8, 10);
	}
// Method
	public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore+=2000;
			System.out.println("Your final score is " + finalScore);
			return finalScore;
		}else {
			return -1;// якщо буде false
		}
	} */

	int positionInTable = calculateHighScorePosition (1500);
	displayHighScorePosition("Bread", positionInTable);
	
	positionInTable = calculateHighScorePosition (5023); // не потрібно писати Int positionInTable тому що ми вже цю змінну задекларували. Буде помилка якщо напишемо з int 
	displayHighScorePosition("Tom", positionInTable);
	
	positionInTable = calculateHighScorePosition (800);
	displayHighScorePosition("Sam", positionInTable);
	
	positionInTable = calculateHighScorePosition (80);
	displayHighScorePosition("Fim", positionInTable);
	
	positionInTable = calculateHighScorePosition (1000);
	displayHighScorePosition("FG", positionInTable);
	}
	
	public static void displayHighScorePosition (String playerName, int positionInTable) {
		System.out.println(playerName + " managed to get into position "
	+ positionInTable + " on the table ");
	}
	
	
	public static int calculateHighScorePosition (int score) {
		/*if(score >= 1000) {
			return 1;
		}else if (score >= 500 && score < 1000) {
			return 2;
		}else if (score >= 100 && score < 500) {
			return 3;
		}
			return 4;
			*/
		int position = 4;
		if (score >=1000) {
			position = 1;
		}else if (score >= 500) {
			position = 2;
		}else if (score >= 100) {
			position = 3;
		}
		return position;
		}
		}
		
	

