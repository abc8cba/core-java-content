package session4;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		System.out.println("Main thread has been started.");
		CalculateResult cr = new CalculateResult();
		cr.start();
		//cr.join();//Polling problem
		//Thread.sleep(1);//Time interval analysis
		synchronized (cr) {
			System.out.println("Producer is going to call wait() method");
			try {
				cr.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Consumer will take result and start further execution");
		}
		
		System.out.println("Result = "+cr.sum);
		
		System.out.println("Main thread has been finished.");
	}

}
