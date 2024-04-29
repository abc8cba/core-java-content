package session5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class UtilityClassFile {
	
	public static void readWriteData(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("D:/"+fileName);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				writeDataInFile(line);
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void writeDataInFile(String line) {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			System.out.println("Data going to be write: " + line);
			fw = new FileWriter("D:/result.txt", true);
			pw = new PrintWriter(fw);
			pw.println(line);
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null) {
					pw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
