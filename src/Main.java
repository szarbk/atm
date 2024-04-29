import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;


public class Main extends JFrame{
    private static int Balance=5000000;
    private static String password ="0000";
    private static String ball ="";
    public static void main(String[] args) {

        JFrame frame = new JFrame("ATM");
        Dimension framesize = new Dimension(600,800);
        frame.setSize(framesize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel pchp = new JPanel();
        JPanel pbal = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0, 600,800);
        p2.setLayout(null);
        p2.setBounds(0,0, 600,800);
        p3.setLayout(null);
        p3.setBounds(0,0, 600,800);
        pchp.setLayout(null);
        pchp.setBounds(0,0, 600,800);
        pbal.setLayout(null);
        pbal.setBounds(0,0, 600,800);
        JLabel lp1 = new JLabel("زبان خود را انتخاب کنید        choose language");//https://stackoverflow.com/
        lp1.setFont(new Font("Calibri", Font.BOLD, 20));
        JLabel lp2 =new JLabel("");
        lp2.setFont(new Font("Calibri", Font.BOLD, 20));
        JLabel lbal =new JLabel("");
        lbal.setFont(new Font("Calibri", Font.BOLD, 20));
        JButton b1p1 = new JButton("English");
        JButton b2p1 = new JButton("فارسی");
        JButton bp2 = new JButton("");
        JButton b1p3 = new JButton("");
        JButton b2p3 = new JButton("");
        JButton b3p3 = new JButton("");
        JButton b4p3 = new JButton("");
        JButton be1 = new JButton("");
        JButton be2 = new JButton("");
        JButton be3 = new JButton("");
        JButton bchp = new JButton("");
        JTextField pass = new JTextField();
        JTextField npass = new JTextField();
        b1p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bp2.setText("enter");
                b1p3.setText("Balance");
                b2p3.setText("withdrawal");
                b3p3.setText("change password");
                b4p3.setText("Deposit to card");
                be1.setText("Exit");
                be2.setText("Exit");
                be3.setText("Exit");
                lp2.setText("password is incorrect");
                bchp.setText("Confirm");
                ball="your balance is :";
                lp2.setBounds(213,250,200,40);
                frame.remove(p1);
                frame.add(p2);
                frame.revalidate();
                frame.repaint();
            }
        });
        b2p1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bp2.setText("ورود");
                b1p3.setText("موجودی");
                b2p3.setText("برداشت از حساب");
                b3p3.setText("تغییر رمز");
                b4p3.setText("کارت به کارت");
                be1.setText("خروج");
                be2.setText("خروج");
                be3.setText("خروج");
                lp2.setText("رمز اشتباه است");
                bchp.setText("تایید");
                ball="موجودی حساب شما :";
                lp2.setBounds(250,250,200,40);
                frame.remove(p1);
                frame.add(p2);
                frame.revalidate();
                frame.repaint();
            }
        });
        bp2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String op= pass.getText();
                if(!password.equals(op))
                    p2.add(lp2);
                else{
                    frame.remove(p2);
                    frame.add(p3);
                }
                frame.revalidate();
                frame.repaint();
            }
        });
        b1p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbal.setText(ball+Balance);
                frame.remove(p3);
                frame.add(pbal);
                frame.revalidate();
                frame.repaint();
            }
        });
        b3p3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(p3);
                frame.add(pchp);
                frame.revalidate();
                frame.repaint();
            }
        });
        be1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(p3);
                frame.add(p1);
                frame.revalidate();
                frame.repaint();
            }
        });
        be2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pchp);
                frame.add(p1);
                frame.revalidate();
                frame.repaint();
            }
        });
        be3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(pbal);
                frame.add(p1);
                frame.revalidate();
                frame.repaint();
            }
        });
        bchp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password=npass.getText();
                frame.remove(pchp);
                frame.add(p1);
                frame.revalidate();
                frame.repaint();
            }
        });
        lp1.setBounds(120,80,400,80);
        lbal.setBounds(200,80,400,80);
        b1p1.setBounds(200,300,200,100);
        b2p1.setBounds(200,420,200,100);
        pass.setBounds(200,200,200,40);
        npass.setBounds(200,200,200,40);
        bchp.setBounds(200,250,200,40);
        bp2.setBounds(200,420,200,100);
        b1p3.setBounds(200,100,200,60);
        b2p3.setBounds(200,180,200,60);
        b3p3.setBounds(200,260,200,60);
        b4p3.setBounds(200,340,200,60);
        be1.setBounds(250,500,100,40);
        be2.setBounds(250,500,100,40);
        be3.setBounds(250,500,100,40);
        p1.setBackground(Color.gray);
        p2.setBackground(Color.gray);
        p3.setBackground(Color.gray);
        pchp.setBackground(Color.gray);
        pbal.setBackground(Color.gray);
        lp2.setForeground(Color.red);
        p1.add(lp1);
        p1.add(b1p1);
        p1.add(b2p1);
        p2.add(bp2);
        p2.add(pass);
        p3.add(b1p3);
        p3.add(b2p3);
        p3.add(b3p3);
        p3.add(b4p3);
        p3.add(be1);
        pchp.add(be2);
        pbal.add(be3);
        pbal.add(lbal);
        pchp.add(npass);
        pchp.add(bchp);
        frame.add(p1);
        frame.setVisible(true);
    }
}
