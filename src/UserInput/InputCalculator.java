package UserInput;

import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage () {
		Scanner sc =  new Scanner(System.in);
		
		int count = 0;
		int sum = 0;
		long average = 0L;
		
		 while(true) {
			 boolean isAnInt= sc.hasNextInt();
			 
			 if(isAnInt) {
				 int number = sc.nextInt();
				 count ++;
				 sum+=number;
			 }else {
				 break;
			 }
			 average = Math.round((double)sum/count);
			 sc.hasNextLine();
			 
		 }
		
		System.out.println("SUM = " + sum + " AVG = " + average);
		sc.close();
	}

}
