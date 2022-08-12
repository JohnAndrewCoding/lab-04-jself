package ver2;

public class Account {
	// Instance variable, only available inside this class.
	// New Comment for Balance
	private double balance;	
	private String name;
	
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
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
	
	// A "getter" and "setter" for name variable.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// A method that increases the balance by amount
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	// Merge Account method that merges two accounts if names are the same.
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance += a.getBalance();
		}
	}
	
	@Override
	public String toString() {
		String msg = "name=" + name + ", balance=$" + balance;
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
