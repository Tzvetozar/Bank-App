package guis;

import javax.swing.*;

/*
   Creating an abstract class allows us to setup the blueprint that GUIs will follow, for example
   in each of the GUIs they will be the same size and will need to invoke their own addGuiComponents()
   which will be unique to each subclass
 */

public abstract class BaseFrame extends JFrame {
    public BaseFrame(String title) {
        initialize(title);
    }

    private void initialize(String title) {
        // Instatiate jframe properties and add a title to the bar
        setTitle(title);

        // set size (in pixels)
        setSize(420,600);

        // terminate the program when gui is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // set layout to null to have absolute layout which allows us to manually specify the size and position of each gui component
        setLayout(null);

        // prevent gui from being resized
        setResizable(false);

        // launch gui in the centre of the screen
        setLocationRelativeTo(null);

        // call on the subclass addGuiComponent()
        addGuiComponents();
    }

    // this method will need to be defined when this class is being inherited from
    protected abstract void addGuiComponents();
}
