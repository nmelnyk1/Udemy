 package InheritanceLesson;

public class Dog extends Animal{

	
	private int yeys;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	// right click->generate from Superclass
	
	public Dog(String name, int body, int size, int weight, int eyes, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.yeys= yeys;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
		
	}
	private void chew() {
		System.out.println("Dog chews food");
		
	}
// now we create an overriden method - a version of the same method that exists
	// in Animal class but unique for Dog class
	// tight click Override Method
	
	@Override
	public void eat() {
		System.out.println("Dog unuqie method");
		chew();
		super.eat();
	}
	public void walk () {
		System.out.println("Dog.walk() called");
		move(5); // move method is called from Animal class
	}
	public void run() {
		System.out.println("Dog run() called");
		move(10);
	}
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
}
