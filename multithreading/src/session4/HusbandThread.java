package session4;

import java.util.Scanner;

public class HusbandThread extends Thread {
	
	private Bank bank;
	
	public HusbandThread(Bank bank) {
		this.bank = bank;
		start();
	}

	@Override
	public void run() {
		synchronized (bank) {
			System.out.println("Current balance before deposit = "+bank.getBalance());
			Scanner s = new Scanner(System.in);
			System.out.println("Enter amount to deposit");
			int amount = s.nextInt();
			bank.deposit(amount);
			System.out.println("Balance after deposit = "+bank.getBalance());
		}
	}
}
