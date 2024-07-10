package electricity.biling.system;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class main_class extends JFrame {
        main_class() {
                setExtendedState(JFrame.MAXIMIZED_BOTH);

                ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("electricity/biling/system/ebs.png"));
                Image image = imageIcon.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
                ImageIcon imageIcon2 = new ImageIcon(image);
                JLabel imageLable = new JLabel(imageIcon2);
                add(imageLable);

                JMenuBar menuBar = new JMenuBar();
                setJMenuBar(menuBar);

                JMenu menu = new JMenu("Menu");
                menu.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(menu);

                JMenuItem newCustomer = new JMenuItem("New Customer");
                newCustomer.setFont(new Font("monospaced", Font.PLAIN, 14));
                ImageIcon customerImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/newcustomer.png"));
                Image customerImage = customerImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                newCustomer.setIcon(new ImageIcon(customerImage));
                menu.add(newCustomer);

                JMenuItem customerdetails = new JMenuItem("Customer Details");
                customerdetails.setFont(new Font("monospaced", Font.PLAIN, 14));
                ImageIcon customerdetailsImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/customerDetails.png"));
                Image customerdetailsImage = customerdetailsImg.getImage().getScaledInstance(20, 20,
                                Image.SCALE_DEFAULT);
                customerdetails.setIcon(new ImageIcon(customerdetailsImage));
                menu.add(customerdetails);

                JMenuItem depositdetails = new JMenuItem("Deposit Details");
                depositdetails.setFont(new Font("monospaced", Font.PLAIN, 14));
                ImageIcon depositdetailsImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/depositdetails.png"));
                Image depositdetailsImage = depositdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                depositdetails.setIcon(new ImageIcon(depositdetailsImage));
                menu.add(depositdetails);

                JMenuItem calculatebill = new JMenuItem("Calculate Bill");
                calculatebill.setFont(new Font("monospaced", Font.PLAIN, 14));
                ImageIcon calculatebillImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/calculatorbills.png"));
                Image calculatebillImage = calculatebillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                calculatebill.setIcon(new ImageIcon(calculatebillImage));
                menu.add(calculatebill);

                JMenu info = new JMenu("Information");
                info.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(info);

                JMenuItem upinfo = new JMenuItem("Update Information");
                upinfo.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon upinfoImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/refresh.png"));
                Image upinfoImage = upinfoImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                upinfo.setIcon(new ImageIcon(upinfoImage));
                info.add(upinfo);

                JMenuItem viewinfo = new JMenuItem("Update Information");
                viewinfo.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon viewinfoImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/information.png"));
                Image viewinfoImage = viewinfoImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                viewinfo.setIcon(new ImageIcon(viewinfoImage));
                info.add(viewinfo);

                JMenu user = new JMenu("User");
                user.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(user);

                JMenuItem paybill = new JMenuItem("Pay Bill");
                paybill.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon paybillImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/pay.png"));
                Image paybillImage = paybillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                paybill.setIcon(new ImageIcon(paybillImage));
                user.add(paybill);

                JMenuItem billdetails = new JMenuItem("Bill Details");
                billdetails.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon billdetailsImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/detail.png"));
                Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                billdetails.setIcon(new ImageIcon(billdetailsImage));
                user.add(billdetails);

                JMenu bill = new JMenu("Bill");
                bill.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(bill);

                JMenuItem genbill = new JMenuItem("Generate Bill");
                genbill.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon genbillImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/bill.png"));
                Image genbillImage = genbillImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                genbill.setIcon(new ImageIcon(genbillImage));
                bill.add(genbill);

                JMenu utility = new JMenu("Utility");
                utility.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(utility);

                JMenuItem notepad = new JMenuItem("Notepad");
                notepad.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon notepadImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/calculator.png"));
                Image notepadImage = notepadImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                notepad.setIcon(new ImageIcon(notepadImage));
                utility.add(notepad);

                JMenuItem calculator = new JMenuItem("Calculator");
                calculator.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon calculatorImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/notepad.png"));
                Image calculatorImage = calculatorImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                calculator.setIcon(new ImageIcon(calculatorImage));
                utility.add(calculator);

                JMenu exit = new JMenu("Exit");
                exit.setFont(new Font("serif", Font.PLAIN, 15));
                menuBar.add(exit);

                JMenuItem eexit = new JMenuItem("Exit");
                eexit.setFont(new Font("monospace", Font.PLAIN, 14));
                ImageIcon eexitImg = new ImageIcon(
                                ClassLoader.getSystemResource("electricity/biling/system/exit.png"));
                Image eexitImage = eexitImg.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
                eexit.setIcon(new ImageIcon(eexitImage));
                exit.add(eexit);

                setLayout(new FlowLayout());
                setVisible(true);
        }

        public static void main(String[] args) {
                new Login();
        }
}
