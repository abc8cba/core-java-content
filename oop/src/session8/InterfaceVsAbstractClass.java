package session8;

abstract class Employee1 {
	private int id;
	private String name;

	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract double calaculateSalary1();// abstract method or What to do?
}

interface Employee2 {	
	
	int ID = 101;
	
	double calaculateSalary2();// abstract method or What to do?
	
    static void display() {
		
	}
	
	default void show() {
			
	}
}

public class InterfaceVsAbstractClass {

}
