package singleton.design.pattern;



class SingletonDesign2{
	
	static SingletonDesign2 singleton2;
	
	private SingletonDesign2() {
		System.out.println("Object Created....");
		
	}
	
//	public static synchronized SingletonDesign2 getInstance(){	
//		if(singleton2 == null){
//			singleton2 = new SingletonDesign2();
//		}
//		System.out.println("singleton2");
//		return singleton2;
//	}
	
	public static SingletonDesign2 getInstance(){	
		if(singleton2 == null){
			synchronized (SingletonDesign2.class) {
				if(singleton2 == null){
					singleton2 = new SingletonDesign2();
				}
			}
			
		}
		System.out.println("singleton2");
		return singleton2;
	}
}



public class SingletonDesignPatternTest2 {

	public static void main(String[] args) {
		
//		Thread t1 = new Thread(new Runnable(){
//			
//			public void run(){
//				SingletonDesign2 s1 = SingletonDesign2.getInstance();
//			}
//		});
//		
//		Thread t2 = new Thread(new Runnable(){
//			
//			public void run(){
//				SingletonDesign2 s2 = SingletonDesign2.getInstance();
//			}
//		});
//		
//		t1.start();
//		t2.start();
		
		Thread t3 = new Thread(()->{
			SingletonDesign2 s1 = SingletonDesign2.getInstance();
		});
		
		Thread t4 = new Thread(()->{
			SingletonDesign2 s1 = SingletonDesign2.getInstance();
		});
		t3.start();
		t4.start();
		
	}

}
