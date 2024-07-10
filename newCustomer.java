package electricity.biling.system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class newCustomer extends JFrame implements ActionListener {
    JLabel heading, customerName, meterNum, address, city, state, email, phone;
    JButton next, cancel;
    TextField nameText, meternumText, addressText, cityText, stateText, emailText, phoneText;

    newCustomer() {

        super("New Customer");
        setSize(700, 450);
        setLocation(300, 100);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252, 186, 3));
        add(panel);

        heading = new JLabel("New Customer");
        heading.setFont(new Font("Tahoma", Font.BOLD, 15));
        heading.setBounds(180, 10, 200, 20);
        panel.add(heading);

        customerName = new JLabel("New Customer");
        customerName.setBounds(50, 80, 100, 20);
        panel.add(customerName);

        nameText = new TextField();
        nameText.setBounds(100, 80, 150, 20);
        panel.add(nameText);

        meterNum = new JLabel("Meter Number");
        meterNum.setBounds(50, 120, 100, 20);
        panel.add(meterNum);

        meternumText = new TextField();
        meternumText.setBounds(100, 120, 150, 20);
        panel.add(meternumText);

        Random ran = new Random();
        long number = ran.nextLong() % 100000;
        meternumText.setText("" + Math.abs(number));

        meterNum = new JLabel("Meter Number");
        meterNum.setBounds(50, 120, 100, 20);
        panel.add(meterNum);

        meternumText = new TextField();
        meternumText.setBounds(100, 120, 150, 20);
        panel.add(meternumText);

        address = new JLabel("Address");
        address.setBounds(50, 160, 100, 20);
        panel.add(address);

        addressText = new TextField();
        addressText.setBounds(100, 160, 150, 20);
        panel.add(addressText);

        city = new JLabel("City");
        city.setBounds(50, 200, 100, 20);
        panel.add(city);

        cityText = new TextField();
        cityText.setBounds(100, 200, 150, 20);
        panel.add(cityText);

        state = new JLabel("State");
        state.setBounds(50, 240, 100, 20);
        panel.add(state);

        stateText = new TextField();
        stateText.setBounds(100, 240, 150, 20);
        panel.add(stateText);

        email = new JLabel("Email");
        email.setBounds(50, 280, 100, 20);
        panel.add(email);

        emailText = new TextField();
        emailText.setBounds(100, 280, 150, 20);
        panel.add(emailText);

        phone = new JLabel("Email");
        phone.setBounds(50, 320, 100, 20);
        panel.add(phone);

        phoneText = new TextField();
        phoneText.setBounds(100, 320, 150, 20);
        panel.add(phoneText);

        next = new JButton("Next");
        next.setBounds(100, 360, 100, 25);
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        panel.add(next);

        cancel = new JButton("Cancel");
        cancel.setBounds(220, 360, 100, 25);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        panel.add(cancel);

        setLayout(new BorderLayout());
        add(panel, "Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("electricity/biling/system/boy.png"));
        Image i2 = i1.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLable = new JLabel(i3);
        add(imgLable, "West");

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String sname = nameText.getText();
            String smeter = meternumText.getText();
            String saddress = addressText.getText();
            String scity = cityText.getText();
            String sstate = stateText.getText();
            String semail = emailText.getText();
            String sphone = phoneText.getText();
            try {
                database c = new database();

                String query_customer = "insert into new_customer values('" + sname + "','" + smeter + "','" + saddress
                        + "','" + scity + "','" + sstate + "','" + semail + "','" + sphone + "')";
                String query_signup = "insert into Signup values('" + smeter + "','" + sname + "','','')";

                c.statement.execute(query_customer);
                c.statement.execute(query_signup);

                JOptionPane.showMessageDialog(null, "Customer Details added successfully");
                setVisible(false);
                new meterInfo(smeter);
            } catch (Exception E) {
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new newCustomer();
    }
}
