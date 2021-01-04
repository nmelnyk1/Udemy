package UdemyAcademy;
// Overloading methods 
public class CalculateScore {

	public static void main(String[] args) {
		 int newScore = calculateScore( "Puyol ", 54);
		 System.out.println("New score is " + newScore);
		 calculateScore(75); // second method is used 
		 calculateScore ("Ozol ", 56);
		 calculateScore();

	}
 public static int calculateScore (String playerName, int score) {
	 System.out.println("Player " + playerName + "scored " + score + "point");
	 return score * 1000;
 }
 public static int calculateScore (int score) {
	 System.out.println("Unnamed player  " + "scored " + score + " point");
	 return score * 1000;
}
 public static int calculateScore () {
	 System.out.println("No player name. Method with 0 value.");
	 return 0;
}
 /*public static void calculateScore () {
	 System.out.println("Unnamed player  point");*/ //will not work
	
}