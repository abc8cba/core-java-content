package shallow.vs.deep.cloning;

public class Employee implements Cloneable {

	private Integer id;
	private String name;
	private String email;
	private Address address;

	public Employee(Integer id, String name, String email, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee)super.clone();
		Address add = (Address)address.clone();
		emp.setAddress(add);
		return emp;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
