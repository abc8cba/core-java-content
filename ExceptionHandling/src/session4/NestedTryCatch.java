package session4;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			System.out.println("From outer-most try block ");
			//System.out.println(1/0);			
			try {
				System.out.println("From outer try block ");				
				String str = "Raj";
				//System.out.println(str.charAt(4));				
				try {
					System.out.println("From inner-most try block ");					
					String str2 = "Raj";
					int num = Integer.parseInt(str2);
					System.out.println(num);
				}catch(Exception e) {
					System.out.println("From inner-most catch block"); 
					throw e;
				}
			}catch(Exception e) {
				System.out.println("From outer catch block");
				throw e;
			}
		}catch(Exception e) {
			System.out.println("From outer-most catch block");
			throw e;
		}

	}

}
