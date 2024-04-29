package session5;

public class ReadWriteFromFile2  implements Runnable{

	private String fileName;

	public ReadWriteFromFile2(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void run() {
		UtilityClassFile.readWriteData(fileName);
	}
}
