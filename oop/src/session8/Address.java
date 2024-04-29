package session8;

public class Address {
	private String countryName;
	private String stateName;
	private String cityName;
	private String landmark;
	private String pincode;

	public Address() {
	}

	public Address(String countryName, String stateName, String cityName, String landmark, String pincode) {
		super();
		this.countryName = countryName;
		this.stateName = stateName;
		this.cityName = cityName;
		this.landmark = landmark;
		this.pincode = pincode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [countryName=" + countryName + ", stateName=" + stateName + ", cityName=" + cityName
				+ ", landmark=" + landmark + ", pincode=" + pincode + "]";
	}

}
