package session1;

public class Division implements Runnable{
	private int num1;
	private int num2;

	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int calculate() {
		return num1 / num2;
	}

	@Override
	public void run() {
		System.out.println("Div = "+calculate());
		
	}

}
