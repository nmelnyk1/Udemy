package UdemyAcademy;

public class FeetAndInches {
	public static void main (String[] args) {
		double newParameter = calcFeetAndInchesToCent(58, 985);
		System.out.println("New parameter is " + newParameter);
		calcFeetAndInchesToCent (-10, 11);
		double newCent = calcFeetAndInchesToCent (6, 10);
		if (newCent < 0.0) {
			System.out.println("Invalid ");
		}
		calcFeetAndInchesToCent (156);
	}
	
	public static double calcFeetAndInchesToCent(double inches, double feet) {
		if ((feet < 0)  || ((inches<0) || (inches >12))) {
			System.out.println("Invalid feet or inches ");

			return -1;
		}
		double cent = (feet * 12) *2.54; // convert feet to centimeters
		cent += inches * 2.54;
		System.out.println ( feet + " feet, " + inches + " inches = " + cent + " cm");
			return cent;
	}
	public static double calcFeetAndInchesToCent(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println ( inches + " inches is equal to " +  feet + " feet and " + remainingInches + " inches left");
		return calcFeetAndInchesToCent(feet, remainingInches);

	}
}
