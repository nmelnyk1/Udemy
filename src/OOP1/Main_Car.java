package OOP1;

public class Main_Car {
public static void main (String [] args) {
	Car porsche = new Car();
	Car holden = new Car();
	porsche.setModel("carrera");
	// calling a method
	System.out.println ("Model is " + porsche.getModel()); 
	
}
}