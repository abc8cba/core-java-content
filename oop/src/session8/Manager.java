package session8;

public class Manager extends FullTimeEmployee implements ICompanyTotalExpenses{

	private String manageDepartment;

	public Manager(Integer id, Name name, Address address, Double costToCompany, String manageDepartment) {
		super(id, name, address, costToCompany);
		this.manageDepartment = manageDepartment;
	}

	public String getManageDepartment() {
		return manageDepartment;
	}

	public void setManageDepartment(String manageDepartment) {
		this.manageDepartment = manageDepartment;
	}

	@Override
	public String toString() {
		return "Manager [manageDepartment=" + manageDepartment + "]";
	}

	@Override
	public Double calculateSalary() {

		return getCostToCompany() / 12;
	}

	@Override
	public double totalSalary() {
		return calculateSalary();
	}

	@Override
	public double totalExpenses() {
		return calculateSalary();
	}

}
