package session8;

public class Cook extends PartTimeEmployee implements ICompanyTotalExpenses {

	private String cooking;

	public Cook(Integer id, Name name, Address address, Double perHourRate, Double totalHours, String cooking) {
		super(id, name, address, perHourRate, totalHours);
		this.cooking = cooking;
	}

	@Override
	public String toString() {
		return "Cook [cooking=" + cooking + "]";
	}

	public String getCooking() {
		return cooking;
	}

	public void setCooking(String cooking) {
		this.cooking = cooking;
	}

	@Override
	public Double calculateWage() {
		return getPerHourRate() * getTotalHours();
	}

	@Override
	public double totalSalary() {
		return calculateWage();
	}

	@Override
	public double totalExpenses() {
		return this.calculateWage();		
	}

}
