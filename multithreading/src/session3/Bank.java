package session3;

import java.util.Scanner;

public class Bank {
	
	private volatile double balance = 40000;
	
	public synchronized void deposit() {
		System.out.println("Before deposit balance = "+balance);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int amount = s.nextInt();		
		balance = balance + amount;
		System.out.println("After deposit balance = "+balance);
	}
	
	public synchronized void withdraw() {
		System.out.println("Before withdraw balance = "+balance);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int amount = s.nextInt();		
		balance = balance - amount;
		System.out.println("After withdraw balance = "+balance);
	}

}
