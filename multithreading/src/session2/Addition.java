package session2;

public class Addition extends Thread{

	private int num1;
	private int num2;

	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}

	public int calculate() {
		return num1 + num2;
	}

	@Override
	public void run() {		
		Multiplication mul = new Multiplication(12, 3);
		try {
			mul.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum = "+calculate());
	}

}
