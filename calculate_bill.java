package electricity.biling.system;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class calculate_bill extends JFrame {
    Choice meternumCho,monthCho;
    JLabel nameText, addressText;
    TextField unitText;
JButton submit,cancel;
    calculate_bill() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(214, 195, 247));
        add(panel);

        JLabel heading = new JLabel("Calculate Electricity Bill");
        heading.setBounds(70, 10, 300, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(heading);

        JLabel meternum = new JLabel("Meter Number");
        meternum.setBounds(50, 80, 100, 20);
        panel.add(meternum);

        meternumCho = new Choice();
        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select*from new_customer");
            while (resultSet.next()) {
                meternumCho.add(resultSet.getString("meter_no"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        meternumCho.setBounds(180, 80, 100, 20);
        panel.add(meternumCho);

        JLabel name = new JLabel("Name");
        name.setBounds(50, 120, 100, 20);
        panel.add(name);

        nameText = new JLabel("");
        nameText.setBounds(180, 120, 150, 20);
        panel.add(nameText);

        JLabel address = new JLabel("Address");
        address.setBounds(50, 160, 100, 20);
        panel.add(address);

        addressText = new JLabel("");
        addressText.setBounds(180, 160, 150, 20);
        panel.add(addressText);

        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select*from new_customer where meter_no");
            while (resultSet.next()) {
                nameText.setText(resultSet.getString("name"));
                addressText.setText(resultSet.getString("address"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

        meternumCho.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                try {
                    database c = new database();
                    ResultSet resultSet = c.statement
                            .executeQuery("Select*from new_customer where meter_no='" + meternumCho);
                    while (resultSet.next()) {
                        nameText.setText(resultSet.getString("name"));
                        addressText.setText(resultSet.getString("address"));
                    }
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JLabel unitconsumed = new JLabel("unit Consumed");
        unitconsumed.setBounds(50, 200, 100, 20);
        panel.add(unitconsumed);

        unitText = new TextField();
        unitText.setBounds(180, 200, 150, 20);
        panel.add(unitText);

        JLabel month=new JLabel("Month");
        month.setBounds(50,240,100,20);
        panel.add(month);

monthCho=new Choice();
monthCho.add("January");
monthCho.add("February");
monthCho.add("March");
monthCho.add("April");
monthCho.add("May");
monthCho.add("June");
monthCho.add("July");
monthCho.add("August");
monthCho.add("September");
monthCho.add("October");
monthCho.add("November");
monthCho.add("December");
monthCho.setBounds(180,240,150,20);
panel.add(monthCho);

submit=new JButton("Submit");
submit.setBounds(80,300,100,25);
submit.setBackground(Color.black);
submit.setForeground(Color.WHITE);
submit.addActionListener((ActionListener) this);
panel.add(submit);


cancel=new JButton("Cancel");
cancel.setBounds(220,300,100,25);
cancel.setBackground(Color.black);
cancel.setForeground(Color.WHITE);
cancel.addActionListener((ActionListener) this);
panel.add(cancel);

setLayout(new BorderLayout());
add(panel,"Center");

        setSize(650, 400);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new calculate_bill();
    }
}
