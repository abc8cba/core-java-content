package project.session4.inheritance;

class Parent{
	
	String name = "Raj";
	
	public Parent() {
		System.out.println("From parent class constructor");
	}
	
	public void show() {
		System.out.println("Hello");
	}
}

class Child extends Parent{
	
	String name = "Neha";
	
	public Child() {
		super();
		System.out.println("From child class constructor");
		show();
		super.show();
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void show() {
		System.out.println("World");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.show();
		Parent p = new Child();
		p.show();
	}

}
