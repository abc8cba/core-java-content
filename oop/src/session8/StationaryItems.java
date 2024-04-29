package session8;

public abstract class StationaryItems {

	private String itemName;
	private Integer quantity;
	private double pricePerQuantity;

	public StationaryItems(String itemName, Integer quantity, double pricePerQuantity){
		this.itemName = itemName;
		this.quantity = quantity;
		this.pricePerQuantity = pricePerQuantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPricePerQuantity() {
		return pricePerQuantity;
	}

	public void setPricePerQuantity(double pricePerQuantity) {
		this.pricePerQuantity = pricePerQuantity;
	}

	@Override
	public String toString() {
		return "StationaryItems [itemName=" + itemName + ", quantity=" + quantity + ", pricePerQuantity="
				+ pricePerQuantity + "]";
	}
	
	public abstract double calculateTotalPrice();

}
