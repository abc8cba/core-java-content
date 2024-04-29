package session2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestCheckedExceptions {

	public static void main(String[] args) throws IOException {
		//writeData();
        readData();
	}
	
	private static void m1()  {
		InputStreamReader isr = new InputStreamReader(System.in);//Node Stream
		BufferedReader br = new BufferedReader(isr);//Filter Stream
		
		try {
			int a = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void readData() throws IOException {
		
			FileReader fr = new FileReader("E:/myfile/data.txt");
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			while(str != null) {
				System.out.println(str);
				str = br.readLine();				
			}
			br.close();
			fr.close();
		
		
	}

	private static void writeData() {
		try {
			FileWriter fw = new FileWriter("E:/myfiles/data.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			String s1 = "India is my country";
			String s2 = "I love my country";
			pw.println(s1);
			pw.println(s2);
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
