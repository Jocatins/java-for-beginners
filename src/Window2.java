import javax.swing.*;

public class Window2 extends JFrame {
    public static void main(String[] args) {
        Window2 window = new Window2();
        window.setVisible(true);
    }

    public Window2() {
        setTitle("My Window Title using JFrame Subclass");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
