package session3;

public class Test {

	public static void main(String[] args) {

		Bank bank = new Bank();
		new HusbandThread(bank);
		new WifeThread(bank);
	}

}
