package session8;

public class Teacher extends FullTimeEmployee implements ICompanyTotalExpenses {

	private String teaching;

	public Teacher(Integer id, Name name, Address address, Double costToCompany, String teaching) {
		super(id, name, address, costToCompany);
		this.teaching = teaching;
	}

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}
	@Override
	public String toString() {
		return "Teacher [teaching=" + teaching + "]";
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
		return this.calculateSalary();
	}

}
