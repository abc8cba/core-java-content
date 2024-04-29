package singleton.design.pattern;

enum SingletonClass{
	
	INSTANCE;
	private SingletonClass(){
		System.out.println("Object Created....");
	}
	
	int x;
	
	public void show(){
		System.out.println("X = "+x);
	}
}
	


public class SingletonDesignPatternTestUsingEnum {

	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.INSTANCE;
		SingletonClass obj2 = SingletonClass.INSTANCE;
		
		obj1.x = 10;
		obj1.show();
		
		obj2.x = 100;
		obj2.show();
		obj1.show();
	}

}
