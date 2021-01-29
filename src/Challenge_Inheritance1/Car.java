package Challenge_Inheritance1;

public class Car extends Vehicle {
	// create unique fields for a Car
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	// generate Constructor
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	// add method to stop and steer. Create setter for current Gear

	public void changetGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear " );
	}
	public void changeVelocity(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car.cnahgeVelocity(): Velocity " + speed + " direction "  + direction);
	}


	}
	

	


