package RMI_Client;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by seyfullah on 02.01.2017.
 */
public class ClientLogin extends JFrame{
    private JButton loginButton;
    private JButton cancelButton;
    private JFrame frame;
    private JPanel panel;
    private JTextField usernameField;
    private JPasswordField passField;
    private JLabel labelUsername, labelpass;

    public ClientLogin(){
        super("Login");
        setBounds(100, 100, 300, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        labelUsername = new JLabel("User Name");
        labelUsername.setBounds(20, 20, 100, 20);
        usernameField = new JTextField("", 10);
        usernameField.setBounds(120, 20, 150, 20);
        labelpass = new JLabel("Password");
        labelpass.setBounds(20, 50, 100,20);
        passField = new JPasswordField();
        passField.setBounds(120, 50, 150, 20);



        loginButton = new JButton("Login");
        loginButton.setBounds(120, 80, 80, 20);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(120,120,80,20);

        panel.add(cancelButton);
        panel.add(loginButton);
        panel.add(usernameField);
        panel.add(passField);
        panel.add(labelpass);
        panel.add(labelUsername);
        add(panel);


    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JButton cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

    public JPasswordField getPassField() {
        return passField;
    }

    public void setPassField(JPasswordField passField) {
        this.passField = passField;
    }

    public JLabel getLabelUsername() {
        return labelUsername;
    }

    public void setLabelUsername(JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }

    public JLabel getLabelpass() {
        return labelpass;
    }

    public void setLabelpass(JLabel labelpass) {
        this.labelpass = labelpass;
    }
}
