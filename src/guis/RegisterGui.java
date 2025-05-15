package guis;

import javax.swing.*;
import java.awt.*;

public class RegisterGui extends BaseFrame{
    public RegisterGui(){
        super("Banking App Register");
    }


    @Override
    protected void addGuiComponents() {

        // create banking app label
        JLabel bankingAppLabel = new JLabel("Banking Application");

        // set the location and the size of the gui component
        bankingAppLabel.setBounds(0, 20, super.getWidth(), 40);

        // change the fond style
        bankingAppLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        // centre text in JLabel
        bankingAppLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // add to gui
        add(bankingAppLabel);

        // username label
        JLabel usernameLabel = new JLabel("Username:");

        // getWidth() returns us the width of our frame which is about 420
        usernameLabel.setBounds(20, 120, getWidth() - 30, 24);

        usernameLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(usernameLabel);

        // create username field
        JTextField userNameField = new JTextField();
        userNameField.setBounds(20, 160, getWidth() - 50, 40);
        userNameField.setFont(new Font("Dialog", Font.PLAIN, 28 ));
        add(userNameField);

        // create password label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20, 220, getWidth() - 50, 24);
        passwordLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(passwordLabel);

        // Create password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(20, 260, getWidth() - 50, 40);
        passwordField.setFont(new Font("Dialog", Font.PLAIN, 28));
        add(passwordField);

        // Create Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(20, 460, getWidth() - 50, 40);
        loginButton.setFont((new Font("Dialog", Font.BOLD, 20)));
        add(loginButton);

        // Create register label
        JLabel registerLabel = new JLabel("<html><a href=\"#\">Don't have an account? Register Here</a></html>");
        registerLabel.setBounds(0, 510, getWidth() - 10, 30);
        registerLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        registerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(registerLabel);

    }
}
