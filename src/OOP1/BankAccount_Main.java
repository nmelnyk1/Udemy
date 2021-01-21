package OOP1;

public class BankAccount_Main {

	public static void main(String[] args) {
		BankAccount bobAccount = new BankAccount("0931355214", 50.65, "Bob Dilan", "memail@bob.com", 56454);
		System.out.println(bobAccount.getBalance());
		System.out.println(bobAccount.getCustomerName());
		
		bobAccount.setBalance(60.0);
		bobAccount.setCustomerName("Bob Brown");
		bobAccount.setEmail("memail@bob.com");
		bobAccount.withdrawal(100.0);
		
		bobAccount.deposit(50.0);
		bobAccount.withdrawal(100.0);
		
		bobAccount.deposit(51.0);
		bobAccount.withdrawal(100.0);
		

	}

}
