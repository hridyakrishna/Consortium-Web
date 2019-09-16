import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Login {
	public Login() {
		JFrame j2 = new JFrame("Consortium Web");
		JLabel a1,a2,a3;
		a1 = new JLabel("Email id");
		a1.setBounds(20,50, 100,30); 
		a2 = new JLabel("Password");
		a2.setBounds(20, 100, 100, 30);
		a3 = new JLabel("Enter email id");
		a3.setBounds(20,50, 100,30); 
		j2.add(a1);j2.add(a2);
		
		
		JTextField ta,tb; 
	    ta=new JTextField("Enter email"); 
	    ta.setBounds(100,50, 100,30);
	    j2.add(ta); 
	    tb=new JTextField("Enter email"); 
	    tb.setBounds(100,100, 100,30);
	    
	    
	    
	    JPasswordField pw;
	    pw = new JPasswordField();
	    pw.setBounds(100,100,100,30);
	    j2.add(pw);
	    
	    
	    JButton ba=new JButton("Login");  
	    ba.setBounds(10,200,95,30);
	    j2.add(ba); 
	    
	    JButton bb=new JButton("Cancel");  
	    bb.setBounds(150,200,95,30);
	    j2.add(bb);
	    bb.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e1) {
	    		System.exit(0);
	    	}
	    }); 
	    
	    JButton bc=new JButton("Forgot Password");  
	    bc.setBounds(300,200,150,30);  
        bc.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e1){  
	    		ResetPW pw = new ResetPW(); 
	    	}  
	    }); 
	    j2.add(bc);
        
        
	    j2.setLayout(null);
		j2.setVisible(true);
		j2.setSize(700,500);
	    
	}
}
