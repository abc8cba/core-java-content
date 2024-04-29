package session2;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	private double fees;

	public Student(String name, int age, double fees) {
		this.name = name;
		this.age = age;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", fees=" + fees + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return getName().compareTo(o.getName());
	}

}
