package session3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class WriteMessage {
	String fileName;
	FileWriter fw = null;
	PrintWriter pw = null;
	
	public WriteMessage(String fileName) {
		this.fileName = fileName;
	}

	public void writeInFile(String msg) throws IOException {
		fw = new FileWriter(fileName);
		pw = new PrintWriter(fw);
		pw.println(msg);
		pw.close();
		System.out.println("Connection Closed...");
	}

	public static void main(String[] args) throws IOException {

		String msg = "Hi Dudes - Today session is suspended.......";
		Queue<String> files = new PriorityQueue<String>();
		//Queue<String> files = new ArrayBlockingQueue<>(10);
		files.offer("file1.txt");
		files.offer("file2.txt");
		files.offer("file3.txt");
		files.offer("file4.txt");
		files.offer("file5.txt");

		for(String file : files){
			new WriteMessage(file).writeInFile(msg);
		}		

	}

}
