package session1;

public class Employee{// implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int compareTo(Employee obj) {
//		
//		
//		//return getId() - obj.getId();//for ascending order
//		//return obj.getId() - getId();//for descending order
//		
//		//return getName().compareTo(obj.getName());//for asc order
//		//return obj.getName().compareTo(getName());//for desc order
//		
//		//return (int)(getSalary() - obj.getSalary());//for asc order
//		return (int)(obj.getSalary() - getSalary());//for asc order
//		
////		int num1 = getId();
////		int num2 = obj.getId();
//		
////		if(num1>num2) {
////			return 1;
////		}else if(num1<num2) {
////			return -1;
////		}else{
////			return 0;
////		}
//		
////		 return (num1 < num2) ? -1 : ((num1 == num2) ? 0 : 1);
//	}
	
	

}
