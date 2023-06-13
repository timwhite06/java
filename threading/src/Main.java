import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

//        Thread t1 = new Thread(new MyRunnable());
//        t1.setName("Thread 1");
//        t1.start();
//
//        Thread t2 = new Thread(new MyRunnable());
//        t2.setName("Thread 2");
//        t2.start();

        JFrame frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JProgressBar progressBar = new JProgressBar();
        progressBar.setMinimum(0);
        progressBar.setMaximum(100);

        JButton progressButton = new JButton("Click for progress");
        progressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgressBarThread progressBarThread = new ProgressBarThread(progressBar);
                progressBarThread.start();
            }
        });

        frame.add(progressBar, BorderLayout.NORTH);
        frame.add(progressButton, BorderLayout.SOUTH);

        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
