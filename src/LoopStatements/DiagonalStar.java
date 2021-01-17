package LoopStatements;

public class DiagonalStar {
public static void printSquareStar (int number) {
	if (number < 5) {
		System.out.println("Invalid Value");
	} for (int row = 1; row <= number; row++) {
		for (int column =1; column <=number; column++) {
			if (row == number || row ==1 || column ==1 || column == number) {
				System.out.println("*");
			}else if (row == column) {
				System.out.println("*");
			}else if (column ==( number - row + 1)) {
				System.out.println("*");
			}else
				System.out.println(" ");
		}
	
	System.out.println();
}
}
}