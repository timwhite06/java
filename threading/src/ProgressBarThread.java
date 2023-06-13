import javax.swing.*;

public class ProgressBarThread extends Thread {
    private JProgressBar progressBar;

    public ProgressBarThread(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            progressBar.setValue(i);
            try {
                Thread.sleep(100); // Adjust the sleep duration to control the progress speed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
