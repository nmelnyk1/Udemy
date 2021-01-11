package LoopStatements;

public class Sum_Challenge {
// create for statement using a range from 1 to 1000 inclusive
// sum all numbers that can be divided both 3 and 5
// for those numbers that met the above conditions, print out number
// break out the loop once you find 5 numbers taht met the above condiitns;
// after breaking out the loop, print sum of numbers that met the above conditions
	
	public static void main (String [] args) {
		int count = 0;
		int sum =0;
		// create loop
		
		for ( int i=1; i <=1000; i++) {
			if ( (i % 3 ==0) && (i % 5 ==0)) {
				count ++;
				sum +=i;
				System.out.println("Found number = " + i);
			}
			
			if (count == 5) {
				break;
			}
		}
		System.out.println("Sum =  " + sum);

	}

}
