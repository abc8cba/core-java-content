package session8;

public class Marker extends StationaryItems implements ICompanyTotalExpenses{

	private String workingType;

	public Marker(String itemName, Integer quantity, double pricePerQuantity, String workingType) {
		super(itemName, quantity, pricePerQuantity);
		this.workingType = workingType;
	}

	public String getWorkingType() {
		return workingType;
	}

	public void setWorkingType(String workingType) {
		this.workingType = workingType;
	}

	@Override
	public String toString() {
		return "Marker [workingType=" + workingType + "]";
	}

	@Override
	public double calculateTotalPrice() {

		return getPricePerQuantity() * getQuantity();
	}

	@Override
	public double totalExpenses() {
		return this.calculateTotalPrice();
		
	}

}
