package electricity.biling.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class update_information extends JFrame implements ActionListener {
    JLabel nameText;
    JTextField addressText, cityText, stateText, emailText, phoneText;
    String meter;
    JButton update, cancel;

    update_information() {

        setBounds(350, 150, 700, 500);
        getContentPane().setBackground(new Color(229, 255, 227));
        setLayout(null);

        JLabel heading = new JLabel("Update Customer Information");
        heading.setBounds(180, 10, 400, 20);
        heading.setFont(new Font("Tahone", Font.BOLD, 20));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(30, 70, 100, 20);
        add(name);

        nameText = new JLabel("");
        nameText.setBounds(150, 70, 200, 20);
        add(nameText);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30, 110, 100, 20);
        add(meterNo);

        JLabel meterText = new JLabel("");
        meterText.setBounds(150, 110, 200, 20);
        add(meterText);

        JLabel address = new JLabel("Address");
        address.setBounds(30, 150, 100, 20);
        add(address);

        JLabel addressText = new JLabel("");
        addressText.setBounds(150, 150, 200, 20);
        add(addressText);

        JLabel city = new JLabel("City");
        city.setBounds(30, 190, 100, 20);
        add(city);

        JLabel cityText = new JLabel("");
        cityText.setBounds(150, 190, 200, 20);
        add(cityText);

        JLabel state = new JLabel("State");
        state.setBounds(30, 230, 100, 20);
        add(state);

        JLabel stateText = new JLabel("");
        stateText.setBounds(150, 230, 200, 20);
        add(stateText);

        JLabel email = new JLabel("Email");
        email.setBounds(30, 270, 100, 20);
        add(email);

        JLabel emailText = new JLabel("");
        emailText.setBounds(150, 270, 200, 20);
        add(emailText);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(30, 310, 100, 20);
        add(phone);

        JLabel phoneText = new JLabel("");
        phoneText.setBounds(150, 310, 200, 20);
        add(phoneText);

        update = new JButton("Update");
        update.setBackground(new Color(33, 106, 145));
        update.setForeground(Color.WHITE);
        update.setBounds(50, 360, 120, 25);
        update.addActionListener(this);
        add(update);

        cancel = new JButton("Cancel");
        cancel.setBackground(new Color(33, 106, 145));
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(200, 360, 120, 25);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("electricity/biling/system/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(410, 410, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imgLabel = new JLabel(imageIcon1);
        imgLabel.setBounds(360, 0, 400, 410);
        add(imgLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new update_information();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
