package session6;



class Parent {
	int id = 101;
	
	private String name;
	private String city;
	
	public Parent() {
		super();//Calling of parent(Object) class constructor using "super"
	}
	
	public Parent(String name, String city) {
		this.name = name;
		this.city = city;
	}

	void show() {
		System.out.println("From Parent class show() method");
	}

}

class Child extends Parent {
	int id = 202;
	
	public Child(String name,String city) {
		super(name,city);//Calling of parent class constructor using "super"
	}
	public void display() {
		System.out.println(id);
		System.out.println(super.id);//Calling of parent class variable using "super"
		System.out.println(this.id);
		show();//Child class show method called
		super.show();//Calling of parent class method using "super"		
	}
	void show() {
		System.out.println("From Child class show() method");
	}
}

public class UseOfThisKeyword {

	public static void main(String[] args) {
		Child obj = new Child("Raj","Solan");
		obj.display();
	}

}
