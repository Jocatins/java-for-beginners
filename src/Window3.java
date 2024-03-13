import java.awt.*; // required for FlowLayout. 
import javax.swing.*;

public class Window3 extends JFrame {
    public static void main(String[] args) {
        Window3 window = new Window3();
        window.setVisible(true);

    }

    public Window3() {
        // Create content panel and set layout

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // ... Add one label to the content panel
        JLabel greeting = new JLabel("Hello World");
        content.add(greeting);

        // ... Set window (JFrame) characteristics
        setContentPane(content);
        pack();
        setTitle("MyWindow using JFrame Subclass");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centre window.

    }

}
