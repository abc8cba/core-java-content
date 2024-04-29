package session4;

import java.util.Scanner;

public class WifeThread extends Thread {
	
	private Bank bank;
	
	public WifeThread(Bank bank) {
		this.bank = bank;
		start();
	}

	@Override
	public void run() {
		synchronized (bank) {
			System.out.println("Current balance before withdraw = "+bank.getBalance());
			Scanner s = new Scanner(System.in);
			System.out.println("Enter amount to withdraw");
			int amount = s.nextInt();
			bank.withdraw(amount);
			System.out.println("Balance after withdraw = "+bank.getBalance());
		}
	}
}
