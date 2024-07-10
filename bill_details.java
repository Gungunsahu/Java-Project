package electricity.biling.system;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class bill_details extends JFrame {
    bill_details() {
        setSize(700, 650);
        setLocation(400, 150);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel table = new JLabel();

        try {
            database c = new database();

        } catch (Exception e) {
            // TODO: handle exception
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new bill_details();
    }
}
