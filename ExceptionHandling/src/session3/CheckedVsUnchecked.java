package session3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CheckedVsUnchecked implements Cloneable {// Marker inteface
	
	int a = 10;
	int b = 20;

	public static void main(String[] args) {

		checkedException();
		// unCheckedException();

	}

	private static void unCheckedException() {
		System.out.println(10 / 0);

	}

	private static void checkedException() {
		// ioException();
		// classNotFoundException();
		// fileNotFoundException();
		// writeDataInFile();
		cloneNotSupportedException();

	}

	private static void cloneNotSupportedException() {	

		CheckedVsUnchecked t1 = new CheckedVsUnchecked();
		System.out.println(t1.a);// 10
		System.out.println(t1.b);// 20
		
		try {
			CheckedVsUnchecked clone = (CheckedVsUnchecked)t1.clone();
			clone.a = 200;
			clone.b = 300;
			System.out.println(clone.a);
			System.out.println(clone.b);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(t1.a);// 10
		System.out.println(t1.b);// 20
	

	}

	private static void writeDataInFile() {

		try {
			FileWriter fw = new FileWriter("E:/myfiles/file1.txt", true);// node stream
			PrintWriter pw = new PrintWriter(fw);// filter stream
			String s1 = "My name is khan";
			String s2 = "Singh is king";
			pw.println(s1);
			pw.println(s2);

			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void fileNotFoundException() {
		try {
			FileReader fr = new FileReader("E:/myfiles/file1.txt");// node stream
			BufferedReader br = new BufferedReader(fr);// filter stream
			String content = br.readLine();

			while (content != null) {
				System.out.println(content);
				content = br.readLine();
			}

			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void classNotFoundException() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void ioException() {
		InputStreamReader isr = new InputStreamReader(System.in);// node stream
		BufferedReader br = new BufferedReader(isr);// filter stream
		try {
			System.out.println("Enter First Number");
			int num1 = Integer.parseInt(br.readLine());
			System.out.println("Enter second Number");
			int num2 = Integer.parseInt(br.readLine());
			int result = num1 + num2;
			System.out.println("Result = " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
