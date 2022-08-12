package ver1;

public class AccountTest {
	public static void main(String[] args) {
		// Execute test methods
		testAccountCreation();
		testToString();
		testDeposit();
		testMultipleDeposits();
		testDepositWithNegativeAmount();
		testWithdraw();
		testMultipleDepositsAndWithdrawals();
		testWithdrawWithNegativeAmount();
	}
	/*
	 * Test 
	 */
	private static void testAccountCreation() {
		System.out.println("-->testAccountCreation");
		Account al = new Account(1000.0);
		System.out.println("balance should be $1000, balance=$" + al.getBalance());
	}
	
	private static void testToString() {
		System.out.println("-->testToString()");
		Account al = new Account(1000.0);
		System.out.println("toString()=" + al);
	}
	private static void testDeposit() {
		System.out.println("-->testDeposit()");
		Account al = new Account(1000.0);
		al.deposit(500.0);
		System.out.println("balance should be $1500, balance=$" + al.getBalance());
	}
	private static void testDepositWithNegativeAmount() {
		System.out.println("-->testDepositWithNegativeAmount()");
		Account al = new Account(1000.0);
		al.deposit(-500.0);
		System.out.println("balance should be $1000, balance=$" + al.getBalance());
	}
	private static void testMultipleDeposits() {
		System.out.println("-->testMultipleDeposits()");
		Account al = new Account(1000.0);
		al.deposit(500.0);
		al.deposit(300.0);
		System.out.println("balance should be $1800, balance+$" + al.getBalance());
	}
	private static void testWithdraw() {
		System.out.println("-->testWithdraw()");
		Account al = new Account(1000.0);
		al.withdraw(600.0);
		System.out.println("balance should be $400, balance =$"+ al.getBalance());
	}
	private static void testWithdrawWithNegativeAmount() {
		System.out.println("-->testWithdrawWithNegativeAmount()");
		Account al = new Account(1000.0);
		al.withdraw(-500.0);
		System.out.println("balance should be $1000, balance=$" + al.getBalance());

	}
	private static void testMultipleDepositsAndWithdrawals() {
		System.out.println("-->testMultipleDepositsAndWithdrawals()");
		Account al = new Account(1000.0);
		al.deposit(500.0);
		al.withdraw(200.0);
		al.deposit(400.0);
		al.withdraw(1000.0);
		System.out.println("balance should be $700, balance =$" + al.getBalance());
	}
}
