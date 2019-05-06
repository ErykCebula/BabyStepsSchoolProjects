import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyThread implements Runnable {

	static File sourceFolder = new File("Test");
	static File destFolder = new File("TestCopy");
	static String[] filePaths = sourceFolder.list();
	private FileCounter counter;
	private Counter threadCounter;
	int fileCounter = 0;
	

	public CopyThread(FileCounter fileCounter, Counter counter) {
		this.counter = fileCounter;
		this.threadCounter = counter;
	}

	public void run() {
		fileCounter = counter.fileCounter();
		int threadcounter = threadCounter.threadCounter();
		try {
			copyFiles(sourceFolder, destFolder, fileCounter, threadcounter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copyFiles(File sourceFile, File targetFile, int fileCounter,
			int threadCounter) throws IOException {
		if (sourceFile.isDirectory()) {
			if (!targetFile.exists())
				targetFile.mkdirs();
			File srcFile = new File(sourceFile.getPath(),
					filePaths[fileCounter - 1]);
			File destFile = new File(targetFile.getPath(),
					filePaths[fileCounter - 1]);

			BufferedInputStream bis = new BufferedInputStream(
					new FileInputStream(srcFile));
			BufferedOutputStream bos = new BufferedOutputStream(
					new FileOutputStream(destFile));

			long fileBytes = srcFile.length();
			long soFar = 0L;

			int theByte;

			while ((theByte = bis.read()) != -1) {
				bos.write(theByte);
				Gui.gui((int) (soFar++ * 100 / fileBytes), threadCounter);
			}
			Gui.gui(100, threadCounter);
			bis.close();
			bos.close();

		}
	}
}
