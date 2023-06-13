import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App {
    JPanel mainPanel;
    private JTextField usernameTextField;
    private JPasswordField passwordField1;
    private JButton loginToThisStupidButton;
    private JLabel usernameToGui;

    private String password;

    public App() {

        loginToThisStupidButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(usernameTextField.getText());
                usernameToGui.setText("Username: " + usernameTextField.getText());
                System.out.println(usernameTextField.getText() == "Tim");
                if(usernameTextField.getText().equals("Tim")) {
                    loginToThisStupidButton.setBackground(Color.GREEN);
                } else {
                    loginToThisStupidButton.setBackground(Color.RED);
                }
            }
        });

        mainPanel.setFocusable(true);
        mainPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                userPressedEnter(e);
            }
        });
        usernameTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                userPressedEnter(e);
            }
        });
        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                userPressedEnter(e);
            }
        });
    }

    public void userPressedEnter(KeyEvent keyPressed) {
        // Enter creates a new line, so we can check this.
        if(keyPressed.getKeyChar() == '\n') {
            System.out.println("Key pressed" + keyPressed.getKeyCode());
            System.out.println("Key pressed" + keyPressed.getKeyChar());
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JLabel getUsernameToGui() {
        return usernameToGui;
    }

    public void setUsernameToGui(JLabel usernameToGui) {
        this.usernameToGui = usernameToGui;
    }
}
