package session2;

public class Division extends Thread{
	private int num1;
	private int num2;

	public Division(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}

	public int calculate() {
		return num1 / num2;
	}

	@Override
	public void run() {
		Addition add = new Addition(12, 3);
		try {
			add.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Div = "+calculate());
		
	}

}
