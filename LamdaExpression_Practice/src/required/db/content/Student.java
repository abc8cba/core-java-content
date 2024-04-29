package required.db.content;

public class Student {

	private String rollNumber;
	private String name;
	private int marks;
	private double fees;
	private String cityName;

	public Student(String rollNumber, String name, int marks, double fees, String cityName) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.fees = fees;
		this.cityName = cityName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + ", fees=" + fees
				+ ", cityName=" + cityName + "]";
	}

}
