import javax.swing.*;
import java.awt.*;

class Window4 extends JFrame {
    private JTextField _humanYearsTF = new JTextField(3);
    private JTextField _dogYearsTF = new JTextField(3);

    public Window4() {
        JButton convertBtn = new JButton("Convert");

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        content.add(new JLabel("Dog years"));
        content.add(_dogYearsTF);
        content.add(convertBtn);
        content.add(new JLabel("Human Years"));
        content.add(_humanYearsTF);

        setContentPane(content);// window attributes
        pack();

        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing the window will close the program
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        Window4 window = new Window4();
        window.setVisible(true);
    }

}
