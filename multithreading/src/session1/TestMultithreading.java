package session1;

public class TestMultithreading {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		//Step 2
		Addition add = new Addition(12,3);
		Substraction sub = new Substraction(12, 3);
		Multiplication mul = new Multiplication(12, 3);
		Division div = new Division(12, 3);
		
		//Step 3
		Thread t1 = new Thread(add);
		Thread t2 = new Thread(sub);
		Thread t3 = new Thread(mul);
		Thread t4 = new Thread(div);
		
		//Step 4
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Main thread finished");
	}
}
