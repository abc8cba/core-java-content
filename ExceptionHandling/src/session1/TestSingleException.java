package session1;

public class TestSingleException {

	public static void main(String[] args) {

		try {
			System.out.println("Raj");
			//System.out.println("Result = "+(12/0));
			System.out.println("Hello");
			int[] arr = {23,34,56,2};
			//System.out.println(arr[5]);
			System.out.println("Hiiii");
			String str = "Raj";
//			int num = Integer.parseInt(str);
//			System.out.println(num);
			String st = "Rohit";
			System.out.println(st.charAt(6));
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		
//		catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.err.println(e);
//		}
//		catch(NumberFormatException nfe) {
//			nfe.printStackTrace();
//		}
		System.out.println("Jojo");

	}

}
