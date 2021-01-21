package OOP1;

public class BankAccount {

	private String number;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	public BankAccount() {
		System.out.println("Empry constructor called");
	}
	
	public BankAccount(String number, double balance, String customerName, String email, int phoneNumber) {
		this.number=number;
		this.balance=balance;
		this.customerName=customerName;
		this.email=email;
		this.phoneNumber=phoneNumber;
		System.out.println("Account constructor will be called");
	}
	
	public void deposit (double depositAmount) {
		this.balance = balance + depositAmount;
		System.out.println("Deposit of " + depositAmount + " New balance is  " + this.balance);
	}
	
	public void withdrawal ( double withdrwalaAmout) {
		if (this.balance - withdrwalaAmout <0) {
			System.out.println("Only " + this.balance + " available. Withdrawal not processed");
		}else {
			this.balance-= withdrwalaAmout;
			System.out.println("Withdrawal of " + withdrwalaAmout + " processed. Remaining balance = " + this.balance);
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
