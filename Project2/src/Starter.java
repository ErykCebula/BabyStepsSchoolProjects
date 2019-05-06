import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Starter {

	public static void main(String[] args) {
		FileCounter fileCounter = new FileCounter();
		Counter counter = new Counter();
		Gui.makeGui();
		ExecutorService execService = Executors.newFixedThreadPool(4);
		if (!CopyThread.sourceFolder.exists()) {
			System.out.println("Source Folder doesnt exist");
			System.exit(0);
		}
		for (int i = 0; i < CopyThread.filePaths.length; i++) {
			execService.execute(new CopyThread(fileCounter, counter));
		}
	}
}
