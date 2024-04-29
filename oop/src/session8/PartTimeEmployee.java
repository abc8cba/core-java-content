package session8;
public abstract class PartTimeEmployee extends Employee {

	private Double perHourRate;
	private Double totalHours;

	public PartTimeEmployee(Integer id, Name name, Address address, Double perHourRate, Double totalHours) {
		super(id, name, address);
		this.perHourRate = perHourRate;
		this.totalHours = totalHours;
	}
	public Double getPerHourRate() {
		return perHourRate;
	}

	public void setPerHourRate(Double perHourRate) {
		this.perHourRate = perHourRate;
	}

	public Double getTotalHours() {
		return totalHours;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [perHourRate=" + perHourRate + ", totalHours=" + totalHours + "]";
	}

	public void setTotalHours(Double totalHours) {
		this.totalHours = totalHours;
	}	

	public abstract Double calculateWage();// what to do?

}
