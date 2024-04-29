package session1;

public class Addition implements Runnable{

	private int num1;
	private int num2;

	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int calculate() {
		return num1 + num2;
	}

	@Override
	public void run() {		
		System.out.println("Sum = "+calculate());
	}

}
