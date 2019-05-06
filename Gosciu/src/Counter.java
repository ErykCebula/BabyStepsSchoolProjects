public class Counter {
	private int threadCounter = 0;

	public int threadCounter() {
		threadCounter=(int) (Thread.currentThread().getId()-14);
		return threadCounter;
	}

}