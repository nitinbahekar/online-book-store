package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b2;
        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - JAVA TRACT");
            //setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(73, 16, 30));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/logo.jpg"));
            Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("ONLINE");
            l3.setForeground(new Color(10, 20, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("BOOK STORE");
            l4.setForeground(new Color(27, 55, 3));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v5.1");
            l5.setForeground(new Color(0, 144, 125));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Java Tract");
            l6.setForeground(new Color(0, 255, 125));
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Contact Us : nitin@gmail.com");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Subscribe us on Youtube : Java Tract");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Follow us on Instagram : java_tract");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("**If you want us to make Java Project for you, drop a mail**");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 400, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
            
            b2 = new JButton("Back");
            b2.addActionListener(this);
            b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
            b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
            b2.setBounds(444, 350, 108, 33);
            b2.setBackground(Color.RED);
            b2.setForeground(Color.WHITE);

            contentPane.add(b2);
	}
        
        public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b2){
                this.setVisible(false);
		new Home().setVisible(true);

            }
         
        }catch(Exception e){
            
        }
    }
}

