public class FileCounter {
	private int fileCounter;
	int threadCounter;

	public int fileCounter() {
		fileCounter += 1;

		return fileCounter;
	}

}