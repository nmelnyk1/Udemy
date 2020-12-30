package UdemyAcademy;

public class Main {

	public static void main(String[] args) {
		int myValue = 10000;
		System.out.println(myValue);
 int myMinValue = Integer.MIN_VALUE;
 int myMaxValye = Integer.MAX_VALUE;
 System.out.println("Integer Mini Value = " + myMinValue);
 System.out.println("Integer Max  Value = " + myMaxValye);
 System.out.println("Busted Max value = " + (myMaxValye + 1));
 // int myMaxIntTest= 2_147_483_648; - will throw an error 
 int myMaxIntTest= 2_147_483_647;
  
 byte myMinByte=Byte.MAX_VALUE;
 byte myMaxByte =Byte.MIN_VALUE;
 System.out.println("My Max Byte is " + myMinByte);
 System.out.println("The min Value of Byte is  " + myMaxByte);
 
 short myShort = 45;
 short myMinShort=Short.MAX_VALUE;
 short myMaxShort = Short.MIN_VALUE;
 System.out.println("My Max Short is " + myMinShort);
 System.out.println("The min Value of Short is  " + myMaxShort);
 
 long myLongValue = 100L;
 long MyLongMax = Long.MAX_VALUE;
 long myMinLong = Long.MIN_VALUE;
 System.out.println("Long  Min Value = " + myLongValue);
 System.out.println("Long Max  Value = " + MyLongMax);
 double bigLong = 2_147_483_647_236D;
		 int myTotal = (myMinValue/2);
		 
		 byte myNewValue = (byte)(myMinByte/2);
		 
		 short myNewShort =(short)(myShort/2);
		 

	}}
 
