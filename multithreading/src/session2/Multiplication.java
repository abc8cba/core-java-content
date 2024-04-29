package session2;

public class Multiplication extends Thread{

	private int num1;
	private int num2;

	public Multiplication(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}

	public int calculate() {
		return num1 * num2;
	}

	@Override
	public void run() {
		System.out.println("Mul = "+calculate());
		
	}

}
