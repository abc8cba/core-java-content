package session8;

public class Name {

	private String firstName;
	private String surName;

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name(String firstName, String surName) {
		super();
		this.firstName = firstName;
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", surName=" + surName + "]";
	}

}
