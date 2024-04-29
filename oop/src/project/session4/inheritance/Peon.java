package project.session4.inheritance;

public class Peon extends Employee{
	
	private String serve;

	public Peon(int id, String name, String contactNum, String serve) {
		super(id, name, contactNum);
		this.serve = serve;
	}

	public String getServe() {
		return serve;
	}

	public void setServe(String serve) {
		this.serve = serve;
	}

	@Override
	public String toString() {
		return super.toString()+ " Peon [serve=" + serve + "]";
	}
	
	

}
