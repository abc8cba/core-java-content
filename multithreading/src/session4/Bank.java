package session4;

public class Bank {
	
	private volatile double balance = 40000.0;
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int amt) {
		balance = balance + amt;
	}
	
	public void withdraw(int amt) {
		balance = balance - amt;
	}

}
