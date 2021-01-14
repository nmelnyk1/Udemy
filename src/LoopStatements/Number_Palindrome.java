package LoopStatements;

public class Number_Palindrome {
	public static boolean isPalindrome(int number) {
		int reverse =0;
		int num = number;
		
		while(number!=0) {
			int lastDigit = number %10;
			reverse = reverse * 10;
			reverse+=lastDigit;
			number /= 10;
		}
		if(num == reverse) {
			return true;
	}else {
		return false;
	}
	
}
}
