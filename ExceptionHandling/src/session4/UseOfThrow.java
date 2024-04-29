package session4;

import java.util.Scanner;

public class UseOfThrow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		//validateAge(age);
		//validateAge2(age);
		
		checkAge(age);
		

	}
	
	private static void checkAge(int age) {
		
		if(age<18) {
			try {
			   throw new MyCustomException("Invalid age");
			}catch(Exception e) {
				e.printStackTrace();
				((MyCustomException)e).myErrorMessage();
				//OR
//				MyCustomException ex =(MyCustomException)e;
//				ex.myErrorMessage();
				
				System.err.println(e);
			}
		}else {
			System.out.println("Age is valid for DL");
		}
	}

	private static void validateAge2(int age) {
		if(age<18) {
			try {
			   throw new Exception("Age is not vaild for driving lincense");
			}catch(Exception e) {
//				e.printStackTrace();
//				String message = e.getMessage();
//				System.err.println(message);
				System.err.println(e);
			}
		}else {
			System.out.println("Age is valid for DL");
		}
		
	}

	private static void validateAge(int age) {
		if(age<18) {
//			RuntimeException re = new RuntimeException("Age is not vaild for driving lincense");
//			throw re;
			throw new RuntimeException("Age is not vaild for driving lincense");
		}else {
			System.out.println("Age is valid for DL");
		}
		
	}

}
