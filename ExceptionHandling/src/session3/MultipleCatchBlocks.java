package session3;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			System.out.println(1/2);
			int[] arr = {23,45};
			System.out.println(arr[1]);
			Object obj = null;
			//Object obj = new Object();
			System.out.println(obj.toString());
			String str = "Ravi";
			int num = Integer.parseInt(str);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		System.out.println("Hello world");

	}

}
