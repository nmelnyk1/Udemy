package InheritanceLesson;

public class Main_Animal {

	public static void main(String[] args) {
		Animal animal =  new Animal ("Animal", 1, 1, 5 ,5);
		
		Dog dog = new Dog ("Yoki", 8, 12, 2 ,4 ,1, 20, "Long silky");
		// dog.eat();
		// dog.run();
		dog.walk();
	}

}
