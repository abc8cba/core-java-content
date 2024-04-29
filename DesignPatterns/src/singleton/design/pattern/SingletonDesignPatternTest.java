package singleton.design.pattern;


class SingletonDesign{
	
	static SingletonDesign singleton;
	//static SingletonDesign singleton = new SingletonDesign();//Eager initialization
	
	private SingletonDesign(){
		System.out.println("Object Created....");
	}
	//Lazy initialization
	public static SingletonDesign getInstance(){
		
		if(singleton == null){
			singleton = new SingletonDesign();
		}
		return singleton;
	}
}


public class SingletonDesignPatternTest {

	public static void main(String[] args) {
		
		SingletonDesign obj1 = SingletonDesign.getInstance();
		SingletonDesign obj2 = SingletonDesign.getInstance();	
		
	}

}
