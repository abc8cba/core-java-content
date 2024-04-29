package session5;

public class ReadDataMultipleFiles {

	public static void main(String[] args) {
		System.out.println("Main thread started...");
		ReadWriteFromFile1 obj1 = new ReadWriteFromFile1("file1.txt");
		ReadWriteFromFile2 obj2 = new ReadWriteFromFile2("file2.txt");
		ReadWriteFromFile3 obj3 = new ReadWriteFromFile3("file3.txt");
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Main thread finished......");
	}

}
