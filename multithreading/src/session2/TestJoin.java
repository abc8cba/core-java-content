package session2;

class Child extends Thread {

	private String job;

	public Child(String job) {		
		this.job = job;
		start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(job+"  "+i);
		}
	}
}

public class TestJoin {

	public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started..");
        
		Child c1 = new Child("First Thread");
		c1.join();
		
		System.out.println("Main thread finished..");
		
	}

}
