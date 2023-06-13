import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BottomPanel extends JPanel {

    JButton myBtn;

    public BottomPanel() {
        this.myBtn = new JButton("hello THERE");
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(100, 80));
        myBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ahhhh");
            }
        });
        add(myBtn);
    }
}
