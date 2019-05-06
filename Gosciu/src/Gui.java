import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Gui {
	static JFrame window = new JFrame("Program kopiujacy");
	static JProgressBar[] progressBars = new JProgressBar[4];

	public static void makeGui() {
		for (int i = 0; i < progressBars.length; i++) {
			progressBars[i] = new JProgressBar();
		}

		window.setLayout(new FlowLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(300, 200);
		window.setVisible(true);

		for (int i = 0; i < progressBars.length; i++) {
			progressBars[i].setMinimum(0);
			progressBars[i].setMaximum(100);
			progressBars[i].setStringPainted(true);
			window.getContentPane().add(progressBars[i]);
		}
	}

	public static void gui(int progressValue, int threadCounter) {
		if (threadCounter == 1) {
			progressBars[0].setValue(progressValue);
		}
		if (threadCounter == 2) {
			progressBars[1].setValue(progressValue);
		}
		if (threadCounter == 3) {
			progressBars[2].setValue(progressValue);
		}
		if (threadCounter == 4) {
			progressBars[3].setValue(progressValue);
		}
	}
}