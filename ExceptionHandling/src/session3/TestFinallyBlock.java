package session3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFinallyBlock {

	public static void main(String[] args) {
		//m1();
		//m2();
		m3();
		

	}

	private static void m3() {
		try {
			System.out.println("try block executed");
			
			System.exit(0);
			
//			Runtime r = Runtime.getRuntime();
//			r.halt(0);
//			System.out.println("Number of cores = "+r.availableProcessors());
			
//			Thread.currentThread().suspend();//Deprecated method
			
//			while(true) {
//				System.out.println("Hello");
//			}
		}finally {
			System.out.println("finally block always executed");
		}
		
	}

	private static void m2() {
		FileReader fr = null;
		BufferedReader br  = null;
		try {
			fr = new FileReader("E:/myfiles/data.txt");
			br = new BufferedReader(fr);
			String str = br.readLine();
			//System.out.println(1/0);
			while(str != null) {
				System.out.println(str);
				str = br.readLine();				
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Catch block called...");
		}finally {
			try {
				br.close();
				fr.close();
				System.out.println("Finally block always executed...");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	private static void m1() {
		
		try(FileReader fr = new FileReader("E:/myfiles/data.txt");
			BufferedReader br = new BufferedReader(fr)
		) //try-with resources
		{
			
			String str = br.readLine();
			//System.out.println(1/0);
			while(str != null) {
				System.out.println(str);
				str = br.readLine();				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
