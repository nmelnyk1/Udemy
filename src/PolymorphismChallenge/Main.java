package PolymorphismChallenge;

public class Main {
	public static void main(String[] args) {
		Car car = new Car(8, "Base car");
		System.out.println(car.accelerate());
		System.out.println(car.brake());
        System.out.println(car.startEngine());
		
        Mitsubishi mitsubishi= new Mitsubishi(6, "Outlander WRM");
        System.out.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.startEngine());
        
        
        
        
        Ford ford= new Ford(6, "Ford Falcon");
        System.out.println(ford.accelerate());
		System.out.println(ford.brake());
        System.out.println(ford.startEngine());
        
       
        Holden holden= new Holden(6, "Holden Comodorre");
        System.out.println(holden.accelerate());
		System.out.println(holden.brake());
        System.out.println(holden.startEngine());
	}

}
