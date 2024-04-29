package session2;

public class TestMultithreading {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started");
		Substraction sub = new Substraction(12, 3);
		sub.join();
		System.out.println("Main thread finished");
	}
}
