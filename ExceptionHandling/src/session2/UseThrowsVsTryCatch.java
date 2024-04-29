package session2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseThrowsVsTryCatch {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		m1();	

	}

	private static void m1() throws NumberFormatException, IOException {
		m2();

	}

	private static void m2() throws NumberFormatException, IOException {
		m3();
		
	}

	private static void m3() throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);// Node Stream
		BufferedReader br = new BufferedReader(isr);// Filter Stream

		System.out.println("Enter any number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Number = "+a);
		
	}

}
