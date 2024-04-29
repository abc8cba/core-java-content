package project.session4.inheritance;

public class Manager extends Employee {

	private String manageDept;

	public Manager(int id, String name, String contactNum, String manageDept) {
		super(id, name, contactNum);
		this.manageDept = manageDept;
	}

	public String getManageDept() {
		return manageDept;
	}

	public void setManageDept(String manageDept) {
		this.manageDept = manageDept;
	}

	@Override
	public String toString() {
		return super.toString()+ "Manager [manageDept=" + manageDept + "]";
	}

}
