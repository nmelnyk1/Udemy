package Composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,  20, 5);
		Case theCase = new Case ("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27inch Beast ", "Acer", 27,new Resolution(2450,1440));
		
		MotherBoard theMotherBoard = new MotherBoard ("BJ", "Asus", 4, 6, "v2.44");
		
		PC  thePC = new PC (theCase, theMonitor, theMotherBoard);
		thePC.powerUp();

}
}