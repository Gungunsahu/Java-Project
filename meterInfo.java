package electricity.biling.system;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class meterInfo extends JFrame implements ActionListener {
  Choice meterLocCho, meterTypeCho, phaseCodeCho, billTypeCho;
  JButton submit;
  String meternumber;

  meterInfo(String meternumber) {
    this.meternumber = meternumber;
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(new Color(252, 186, 3));
    add(panel);

    JLabel heading = new JLabel("Meter Information");
    heading.setBounds(180, 10, 200, 20);
    heading.setFont(new Font("Tahone", Font.BOLD, 20));
    panel.add(heading);

    JLabel meterNumber = new JLabel("Meter Number");
    meterNumber.setBounds(50, 80, 100, 20);
    panel.add(meterNumber);

    JLabel meterNumberText = new JLabel(meternumber);
    meterNumberText.setBounds(100, 80, 100, 20);
    panel.add(meterNumberText);

    JLabel meterLoc = new JLabel("Meter Number");
    meterLoc.setBounds(50, 120, 100, 20);
    panel.add(meterLoc);

    meterLocCho = new Choice();
    meterLocCho.add("Outside");
    meterLocCho.add("Inside");
    meterLocCho.setBounds(180, 120, 150, 20);
    panel.add(meterLocCho);

    JLabel meterType = new JLabel("Meter Type");
    meterType.setBounds(50, 160, 100, 20);
    panel.add(meterType);

    meterTypeCho = new Choice();
    meterTypeCho.add("Electric Meter");
    meterTypeCho.add("Solar Meter");
    meterTypeCho.add("Smart Meter");
    meterTypeCho.setBounds(180, 160, 150, 20);
    panel.add(meterTypeCho);

    JLabel phaseCode = new JLabel("Phase Code");
    phaseCode.setBounds(50, 200, 100, 20);
    panel.add(phaseCode);

    phaseCodeCho = new Choice();
    phaseCodeCho.add("011");
    phaseCodeCho.add("022");
    phaseCodeCho.add("033");
    phaseCodeCho.add("044");
    phaseCodeCho.add("055");
    phaseCodeCho.add("066");
    phaseCodeCho.add("077");
    phaseCodeCho.add("088");
    phaseCodeCho.add("099");
    phaseCodeCho.setBounds(180, 200, 150, 20);
    panel.add(phaseCodeCho);

    JLabel billType = new JLabel("Bill Type");
    billType.setBounds(50, 240, 100, 20);
    panel.add(billType);

    billTypeCho = new Choice();
    billTypeCho.add("Normal");
    billTypeCho.add("Industrial");
    billTypeCho.setBounds(180, 240, 150, 20);
    panel.add(billTypeCho);

    JLabel day = new JLabel("20 Days Billing Time...");
    day.setBounds(50, 280, 150, 20);
    panel.add(day);

    JLabel note = new JLabel("Note:-");
    note.setBounds(50, 320, 100, 20);
    panel.add(note);

    JLabel note1 = new JLabel("By default bill is calculated for 30 days only");
    note1.setBounds(50, 360, 300, 20);
    panel.add(note1);

    submit = new JButton("Submit");
    submit.setBounds(200, 390, 100, 20);
    submit.setBackground(Color.BLACK);
    submit.setForeground(Color.WHITE);
    panel.add(submit);

    setLayout(new BorderLayout());
    add(panel, "Center");

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("electricity/biling/system/details.png"));
    Image i2 = i1.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel imgLable = new JLabel(i3);
    add(imgLable, "East");

    setSize(700, 500);
    setLocation(400, 200);
    setVisible(true);
  }

  /*
   * @Override
   * public void actionPerformed(ActionEvent e) {
   * if (e.getSource() == submit) {
   * String smeterNum = meternumber;
   * String smeterLoc = meterLocCho.getSelectedItem();
   * String smeterTyp = meterTypeCho.getSelectedItem();
   * String sphaseCode = phaseCodeCho.getSelectedItem();
   * String sbillTyp = billTypeCho.getSelectedItem();
   * String sday = "30";
   * 
   * String query_meterInfo = "insert into meter_info values('" + smeterNum +
   * "','" + smeterLoc + "','" + smeterTyp
   * + "','" + sphaseCode + "','" + sbillTyp + "','" + sday + "')";
   * try {
   * database c = new database();
   * c.statement.executeUpdate(query_meterInfo);
   * 
   * JOptionPane.showMessageDialog(null, "");
   * setVisible(false);
   * } catch (Exception E) {
   * E.printStackTrace();
   * }
   * } else {
   * setVisible(false);
   * }
   * }
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {
      String smeterNum = meternumber;
      String smeterLoc = meterLocCho.getSelectedItem();
      String smeterTyp = meterTypeCho.getSelectedItem();
      String sphaseCode = phaseCodeCho.getSelectedItem();
      String sbillTyp = billTypeCho.getSelectedItem();
      String sday = "30";
      try {
        database c = new database();

        String query_meterInfo = "insert into meter_info values('" + smeterNum + "','" + smeterLoc + "','" + smeterTyp
            + "','" + sphaseCode + "','" + sbillTyp + "','" + sday + "')";
        c.statement.executeUpdate(query_meterInfo);

        JOptionPane.showMessageDialog(null, "Meter Information Saved");
        setVisible(false);
      } catch (Exception E) {
        E.printStackTrace();
      }
    } else {
      setVisible(false);
    }
  }

  public static void main(String[] args) {
    new meterInfo("");
  }
}