package session8;

public abstract class FullTimeEmployee extends Employee {

	private Double costToCompany;

	public FullTimeEmployee(Integer id, Name name, Address address, Double costToCompany) {
		super(id, name, address);
		this.costToCompany = costToCompany;
	}

	public Double getCostToCompany() {
		return costToCompany;
	}

	public void setCostToCompany(Double costToCompany) {
		this.costToCompany = costToCompany;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [costToCompany=" + costToCompany + "]";
	}
	
	public abstract Double calculateSalary();// what to do?

}
