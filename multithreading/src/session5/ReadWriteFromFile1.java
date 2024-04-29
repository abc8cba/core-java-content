package session5;

public class ReadWriteFromFile1 implements Runnable {

	private String fileName;

	public ReadWriteFromFile1(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		UtilityClassFile.readWriteData(fileName);
	}
}
