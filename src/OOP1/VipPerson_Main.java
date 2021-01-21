package OOP1;

public class VipPerson_Main {

	public static void main(String[] args) {
		
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		
		VipPerson person2 = new VipPerson("Jesse", 2500.00);
		System.out.println(person2.getName());
		
		VipPerson person3 = new VipPerson("Fitch", 562.45, "ted@yahoo.com");
		System.out.println(person3.getName());
		
		

	}

}
