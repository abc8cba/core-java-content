package session1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class TestExceptions {
	

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
		
//		m10();
//		m11();
//		System.out.println("Hello");
	}
	
	private static void m11()  {
		InputStreamReader isr = new InputStreamReader(System.in);//Node Stream
		BufferedReader br = new BufferedReader(isr);//Filter Stream
		
		try {
			int a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void m10() {
		Object obj1 = new String("Raj");		
		Object obj2 = new StringBuffer("Neha");
		String str2 = (String)obj1;
		System.out.println(obj1.hashCode() +"    "+str2.hashCode());
		
		String str = (String)obj2;//java.lang.ClassCastException
		
	}
	
	private static void m9() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s.nextInt();//java.util.InputMismatchException -> If enter wrong values
	}
	
	private static void m8() {
		int[] arr = {23,34,56,2};
		System.out.println(arr[5]); //java.lang.ArrayIndexOutOfBoundsException
	}
	
	private static void m7() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(10);
		list.add("Raj");
		System.out.println(list.get(3));// java.lang.IndexOutOfBoundsException
	}
	
	private static void m6() {
		System.out.println(10/0);//java.lang.ArithmeticException:
	}
	
	private static void m5() {
		Thread t = new Thread();
		t.setPriority(20);  //java.lang.IllegalArgumentException
	}
	
	private static void m4() {
		String str[] = {"Nilesh","Mohan"};
		System.out.println(str[4]); //java.lang.ArrayIndexOutOfBoundsException
	}

	private static void m1() {
		String str = "Nilesh";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(6));  //java.lang.StringIndexOutOfBoundsException
	}
	
	private static void m2() {
		String str = "Raj";
		//String str = "10";
		int num = Integer.parseInt(str);// java.lang.NumberFormatException
		System.out.println(num);
		
	}
	
	private static void m3() {
		Scanner s = null;
		//Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();  //java.lang.NullPointerException
		System.out.println(name);
		
		StringBuffer str = null;
		System.out.println(str.charAt(0));  //java.lang.NullPointerException
	}

}