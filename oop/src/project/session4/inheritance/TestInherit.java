package project.session4.inheritance;

public class TestInherit {

	public static void main(String[] args) {
		
		Manager m = new Manager(101,"Raj","9876543210","Manage Sales Dept");
		System.out.println(m);
		
		Peon p = new Peon(1012, "Jogender", "64378434347", "Do serve operations");
		System.out.println(p);
	}

}
