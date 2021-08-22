package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LibraryManagementSystem extends JFrame implements ActionListener{

        JLabel l1;
        JButton b1;
        
        public LibraryManagementSystem() {
		
                super("ONLINE BOOK STORE");
                setSize(1366,390);
                setLayout(null);
                setLocation(100,300);

		l1 = new JLabel("");
                b1 = new JButton("Start");
                b1.setFont(new Font("Tahoma", Font.BOLD, 17));
                b1.setBackground(Color.RED);
                b1.setForeground(Color.WHITE);
				
                
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/hehe.jpg"));
                Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                l1 = new JLabel(i2);
                
                b1.setBounds(1050,250,200,60);
		l1.setBounds(0, 0, 1366, 390);
                
                l1.add(b1);
		add(l1);
                
                b1.addActionListener(this);
	}
        
        public void actionPerformed(ActionEvent ae){
                new Login_user().setVisible(true);
                this.setVisible(false);
                
        }
        
        public static void main(String[] args) {
                LibraryManagementSystem window = new LibraryManagementSystem();
                window.setVisible(true);			
	}
}
