package electricity.biling.system;

import java.awt.Choice;
import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class customer_details extends JFrame {
    Choice searchMeterCho, searchNameCho;

    customer_details() {
        super("Customer Details");
        getContentPane().setBackground(new Color(192, 186, 254));
        setSize(700, 500);
        setLocation(400, 200);
        setLayout(null);

        searchMeterCho = new Choice();
        searchMeterCho.setBounds(180, 20, 150, 20);
        add(searchMeterCho);
        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("Select*from new_customer");
            while (resultSet.next()) {
                searchMeterCho.add(resultSet.getString("meter_no"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
        JLabel searchMeter = new JLabel("Search by Meter Number");
        searchMeter.setBounds(20, 20, 150, 20);
        add(searchMeter);

        JLabel searchName = new JLabel("Search by Name");
        searchName.setBounds(400, 20, 100, 20);
        add(searchName);

        searchNameCho = new Choice();
        searchNameCho.setBounds(520, 20, 150, 20);
        add(searchNameCho);

        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("Select*from new_customer");
            while (resultSet.next()) {
                searchNameCho.add(resultSet.getString("name"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

        JLabel table = new JLabel();
        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("Select*from new_customer");
            while (resultSet.next()) {

            }
        } catch (Exception E) {
            E.printStackTrace();
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new customer_details();
    }
}
