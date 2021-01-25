package InheritanceLesson;

public class Fish extends Animal{
	private int gills;
	private int yeys;
	private int fins;
	
	// create a constructor which add in () parameters from super class:
	//(String name, int brain, int body, int size, int weight, int gills, int yeys, int fins)
	
	public Fish(String name, int size, int weight, int gills, int yeys, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.yeys = yeys;
		this.fins = fins;
	}

private void rest() {
}

private void moveMuscles() {
	
}
private void moveBackFin() {

}

private void swim(int speed) {
	moveMuscles();
	moveBackFin();
	super.move(speed);
}

}








