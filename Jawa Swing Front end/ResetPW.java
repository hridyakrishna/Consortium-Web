import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ResetPW {
	public ResetPW() {
		
		JFrame j3 = new JFrame("Consortium Web");
		JLabel lx;
		lx = new JLabel("Enter Email to recieve reset link");
		lx.setBounds(20,50, 400,30);
		j3.add(lx);
		
		JTextField tx; 
	    tx=new JTextField();
	    tx.setBounds(95,100, 200,30); 
	    j3.add(tx);
	    
	    JButton bx=new JButton("send reset link");  
	    bx.setBounds(95,150,150,30);
	    j3.add(bx);
	    
	    j3.setSize(800,600);  
        j3.setLayout(null);  
        j3.setVisible(true); 
        
    }
}
