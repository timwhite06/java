import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public MainFrame() {
        JFrame frame = new JFrame("GUI Practice WOOO");
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.RED);
        topPanel.setPreferredSize(new Dimension(100, 80));

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.GREEN);
        leftPanel.setPreferredSize(new Dimension(40, 0));


        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.BLUE);
        rightPanel.setPreferredSize(new Dimension(40, 0));



        BottomPanel bottomPanel = new BottomPanel();

        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.WHITE);
        JLabel centerLabel = new JLabel("SIUUUUUUUUUUUU");
        middlePanel.add(centerLabel);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel,BorderLayout.EAST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(middlePanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
