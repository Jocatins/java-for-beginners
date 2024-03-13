import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // Needed for ActionListene

class Window5 extends JFrame {

    private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;
    private JTextField _humanTearsTF = new JTextField(3);
    private JTextField _dogYearsTF = new JTextField(3);

    public Window5() {
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());
        _dogYearsTF.addActionListener(new ConvertBtnListener());

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        content.add(new JLabel("Dog Years"));
        content.add(_dogYearsTF);
        content.add(convertBtn);

        content.add(_humanTearsTF);

        setContentPane(content);
        pack();

        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
    }

    class ConvertBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String dyStr = _dogYearsTF.getText();
            int dogYears = Integer.parseInt(dyStr);

            int humanYears = dogYears * DOG_YEARS_PER_HUMAN_YEAR;
            _humanTearsTF.setText(" " + humanYears);
        }
    }

    public static void main(String[] args) {
        Window5 window = new Window5();
        window.setVisible(true);
    }

}
