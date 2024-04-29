package session3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RecoveryUsingCatchBlock {

	public static void main(String[] args) throws Exception {
		try {

			fromUSServer();
		} catch (Exception e) {

			fromIndiaServer();
		}
	}

	

	private static void fromUSServer() throws Exception {

		FileReader fr = new FileReader("E:/US/data.txt"); // US Server
		BufferedReader br = new BufferedReader(fr);
		System.out.println("From US Server");
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}

	}

	private static void fromIndiaServer() throws Exception {

		FileReader fr = new FileReader("E:/India/data.txt"); // India Server
		BufferedReader br = new BufferedReader(fr);
		System.out.println("From India Server");
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}

	}

}
