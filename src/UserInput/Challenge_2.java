package UserInput;

import java.util.Scanner;

public class Challenge_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int count =0;
		int sum = 0;
		while (true) {
			int order = count + 1;
			System.out.println("Enter number # " + order + ":");
			
			boolean isAnInt = scanner.hasNextInt();
		if (isAnInt) {
			int number = scanner.nextInt();
			count ++;
			sum +=number;
		
			if (count == 10) {
				break;
			}
		}else {
			System.out.println("invalid number");
		}
		scanner.nextLine();
		}
		System.out.println("sum + " + sum);
		scanner.close();

	}

}
