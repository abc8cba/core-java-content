package session8;

public class Sweeper extends PartTimeEmployee implements ICompanyTotalExpenses{

	private String sweeping;

	public Sweeper(Integer id, Name name, Address address, Double perHourRate, Double totalHours, String sweeping) {
		super(id, name, address, perHourRate, totalHours);
		this.sweeping = sweeping;
	}

	public String getSweeping() {
		return sweeping;
	}

	public void setSweeping(String sweeping) {
		this.sweeping = sweeping;
	}

	@Override
	public String toString() {
		return "Sweeper [sweeping=" + sweeping + "]";
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
