package UdemyAcademy;

public class FloatingPointNum {
	public static void main (String[] args) {
		 int Int = 5/3;
		 float myFloat = 5f /3f;
		 double myDouble = 5.00/3.00;
		 System.out.println("Int " + Int);
		 System.out.println("myFloat " + myFloat);
		 System.out.println("myDouble " + myDouble);
		 
		 double nem = 200d;
		 double con = nem + 0.45359237d;
				 System.out.println("converted  = " + con);
				 
				 char myChar = 'D';
				 char myUniCode = '\u0044';
				 System.out.println(myUniCode);
				 System.out.println(myChar);
				 String myString = "This is a string";
				 System.out.println(myString);
				 myString = myString + "Add something for ";
				 System.out.println("This string is equal to = " + myString);
				 myString = myString + "\u00A9 2019";
				 System.out.println("This String is equal to = " + myString);
				 String numberString = "250.55";
				 numberString = numberString + "49.56";
				 System.out.println(numberString);
				 String lastString = "10";
				 int myInt = 50;
				 lastString = lastString + myInt;
				 System.out.println("Results is " + lastString);
				  double doubleNum = 120.45d;
				  lastString = lastString + doubleNum;
				  System.out.println("Results 2 is " + lastString); 
				  
				 int result = 5+ 2;
				 System.out.println("1+2 = " + result);
				 int previusResult =result;
				 System.out.println("previous res " + result);
				 result = result - 0;
				 System.out.println(previusResult);
				 result = result % 3;
				 System.out.println("remainder" + result);
				 result++; 
				 System.out.println( result);
				 result--;
				 System.out.println( result);
				 
				 boolean isAlien = false;
				 if (isAlien == true) {
				 System.out.println("It is not an Alien");
				 }

				int topScore = 100;
				 if (topScore==100) {
					 System.out.println("You got the high score");
				 }
				 
				 topScore = 100; // will not print out 
				 if (topScore!=100) {
					 System.out.println("You got the high score");
				 }
				 topScore = 100;
				 if (topScore >=100) {
					 System.out.println("Print me");
				 }
				 int secondScore = 60;
				 if (topScore > secondScore && topScore < 100) {
					 System.out.println("Greater than second score"); // will not print out 
				 }
				 secondScore = 61;
				 if ((topScore > secondScore) && (topScore <= 100)) {
					 System.out.println("Greater than whatever score"); // will not print out 
				 }
				 if((topScore >90) || (secondScore <65)) {
					 System.out.println("We are testing logical operands -true");
				 }
				 int newValue =50;
				 if (newValue != 51) {
					 System.out.println("This is an error");
				 }
				 boolean isCar = false;
				 if (!isCar) {
				 System.out.println("This is not supposed to happen");
}
				 isCar =true;
				 boolean wasCar = isCar ? true : false;
				 if (wasCar) {
					 System.out.println("wasCar is true ");
				 }
				double firstValue =20.00d;
				double secondValue = 80.00d;
				double thirdValue = (firstValue + secondValue) * 100.00d;
				System.out.println("The total of third value is = " + thirdValue);
				
				double theRemainder = thirdValue % 40.00d;
				System.out.println("The remainder is = " + theRemainder);
				
				boolean finalValue = (theRemainder==0) ? true : false;
				System.out.println("Final Value is = " + finalValue);
				
				if (finalValue == false) {
					System.out.println("Got some remaidner ");
				}
				
				
				
				
				 
				 }
	
}

