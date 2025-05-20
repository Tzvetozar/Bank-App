package guis;

import javax.swing.*;
import java.awt.*;

/*
   This Gui will allow user to login or launch the register gui
   This extends from the BaseFrame which emans we will need to define our own addGuiComponent()
 */

public class LoginGui extends BaseFrame {
    public LoginGui() {
        super("Banking App Login");
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
    }
}
