package shallow.vs.deep.cloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Mumbai", "Maharastra", "400072");
		Employee employee1= new Employee(101, "Raj", "raj@gmail.com", address);
		System.out.println(employee1);
		Employee employee2 = (Employee)employee1.clone();
		System.out.println("Emp1 >>> "+employee1);
		System.out.println("Emp2 >>> "+employee2);
		
		System.out.println("=======================================");
		employee2.getAddress().setCity("Nagpur");
		System.out.println("Emp1 >>> "+employee1);
		System.out.println("Emp2 >>> "+employee2);

	}

}
