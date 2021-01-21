package OOP1;

public class VipPerson {

	private String name;
    private double creditLimit;
    private String email;

  //empty constructor
    public VipPerson() {
    	this("Natalia", 452.65, "hichkok#@gmail.ru");
    }
    
    // constructor passing 2 value it recieves and 3rd value default
    
    public VipPerson(String name, double creditLimit) {
    	this(name, creditLimit, "default@gmail.com");
    }
    
    // third method
    public VipPerson(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
