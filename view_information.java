package electricity.biling.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class view_information extends JFrame {
    view_information() {
        setBounds(350, 150, 700, 500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("View Customer Information");
        heading.setBounds(175, 0, 500, 40);
        heading.setFont(new Font("serif", Font.BOLD, 20));
        add(heading);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(50, 80, 100, 20);
        add(nameLabel);

        JLabel nameLabelText = new JLabel("");
        nameLabelText.setBounds(100, 80, 150, 20);
        add(nameLabelText);

        JLabel meterno = new JLabel("Meter Number");
        meterno.setBounds(50, 120, 150, 20);
        add(meterno);

        JLabel meternoText = new JLabel("");
        meternoText.setBounds(100, 120, 150, 20);
        add(meternoText);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 160, 150, 20);
        add(address);

        JLabel addressText = new JLabel("");
        addressText.setBounds(100, 160, 150, 20);
        add(addressText);

        JLabel city = new JLabel("City");
        city.setBounds(50, 200, 150, 20);
        add(city);

        JLabel cityText = new JLabel("");
        cityText.setBounds(100, 200, 150, 20);
        add(cityText);

        JLabel state = new JLabel("State");
        state.setBounds(400, 80, 150, 20);
        add(state);

        JLabel stateText = new JLabel("");
        stateText.setBounds(450, 80, 150, 20);
        add(stateText);

        JLabel email = new JLabel("Email");
        email.setBounds(400, 120, 150, 20);
        add(email);

        JLabel emailText = new JLabel("");
        emailText.setBounds(450, 120, 150, 20);
        add(emailText);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(400, 160, 150, 20);
        add(phone);

        JLabel phoneText = new JLabel("");
        phoneText.setBounds(450, 160, 150, 20);
        add(phoneText);

    }

    public static void main(String[] args) {
        new view_information();
    }
}
