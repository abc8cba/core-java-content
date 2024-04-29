package session6;

public class Student {
	public int id;// instance variable
	private String name;// instance variable
	private String email;// instance variable

	public Student(int id, String name, String email) {
		this(id, name);//calling of constructor using "this"
		this.email = email;
	}
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;//calling of instance variable using "this"
		this.display();//calling of method using "this"
		display();
	}
	
	void display(){
		System.out.println("display() method called...");
	}
}
