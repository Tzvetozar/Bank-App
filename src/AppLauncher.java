import guis.LoginGui;
import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {

        // useinvokeLater to make updates to the GUI more thread-safe
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginGui().setVisible(true);

            }
        });
    }
}