package session4;

public class Test {

	public static void main(String[] args) {
		Bank b = new Bank();
		new HusbandThread(b);
		new WifeThread(b);

	}

}
