package session4;

public class CalculateResult extends Thread{
	
	int sum = 0;
	
	@Override
	public void run() {
		System.out.println("Calculation is going to process");
		for(int i=1;i<=10;i++) {
			this.sum = sum +i;
		}
		synchronized (this) {
			System.out.println("Producer is going to inform cosumer");
			this.notify();
			System.out.println("Producer will continue its execution after call notify() method.");
		}
		
		System.out.println("Calculation is going to be finish");
	}

}
