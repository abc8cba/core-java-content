package session5;

public class ReadWriteFromFile3 implements Runnable{

	
	private String fileName;

	public ReadWriteFromFile3(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		UtilityClassFile.readWriteData(fileName);
	}
}
