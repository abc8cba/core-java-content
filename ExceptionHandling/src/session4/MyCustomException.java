package session4;

public class MyCustomException extends RuntimeException {

	private String message;

	public MyCustomException(String message) {
		super(message);
		this.message = message;
	}
	
	public void myErrorMessage() {
		System.out.println(message);
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("My custom message from printStackTrace");
	}
	
}
