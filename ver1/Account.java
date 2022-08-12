package ver1;

public class Account {
	// Instance variable, only available inside this class.
	private double balance;	
	
	//Constructor
	public Account(double initBalance) {
		balance = initBalance;
	}
	
	
	// Decreases the balance by amount
	public void withdraw(double amount ) {
		if(amount>0) {
			balance -= amount;
		}
	}
	

	// A "getter" method that simply returns the balance.
	public double getBalance() {
		return balance;
	}
	
	// A method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	@Override
	public String toString() {
		String msg = "balance=$" + balance;
		return msg;
	}
	// Informal test code
	public static void main(String[] args) {
		Account al = new Account(0);
		System.out.println("Balance" + al.getBalance());
		al.deposit(500.0);
		System.out.println("Balance=$" + al.getBalance());
		al.withdraw(200.0);
		System.out.println("Balance=$" + al.getBalance());
		System.out.println(al.toString());
		System.out.println(al);
	}
}
