package project.session4.inheritance;

public class Employee {

	private int id;
	private String name;
	private String contactNum;

	public Employee(int id, String name, String contactNum) {
		this.id = id;
		this.name = name;
		this.contactNum = contactNum;
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

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", contactNum=" + contactNum + "]";
	}

	public double totalSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

}
