import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Register {
	public Register() {
		JFrame j1 = new JFrame("Consortium Web");
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
		l1 = new JLabel("Name");
		l1.setBounds(20,50, 100,30); 
		l2 = new JLabel("Date of Birth");
		l2.setBounds(20, 100, 100, 30);
		l3 = new JLabel("Gender");
		l3.setBounds(20, 150, 100, 30);
		l4 = new JLabel("Talent");
		l4.setBounds(20,300,100,30);
		l5 = new JLabel("Address");
		l5.setBounds(20,350,100,30);
		l6 = new JLabel("Language Preference");
		l6.setBounds(20,600,250,30);
		l7 = new JLabel("Contact number");
		l7.setBounds(20,750,250,30);
		l8 = new JLabel("Password");
		l8.setBounds(20,800,250,30);
		l9 = new JLabel("Confirm Password");
		l9.setBounds(20,850,250,30);
		j1.add(l1);j1.add(l2);j1.add(l3);j1.add(l4);j1.add(l5);j1.add(l6);j1.add(l7);j1.add(l8);j1.add(l9);
		
		
		JTextField t1,t2,t3; 
	    t1=new JTextField("Enter your full name");  
	    t2=new JTextField("DD-MM-YYYY");
	    t3=new JTextField("Enter valid phone number");
	    t1.setBounds(95,50, 200,30); 
	    t2.setBounds(125,100,200,30);
	    t3.setBounds(150,750,200,30);
	    j1.add(t1);j1.add(t2);j1.add(t3);
	    
	    
	    JPasswordField value1;
	    JPasswordField value2;
	    value1 = new JPasswordField();  
	    value1.setBounds(100,800,100,30);   
	    value2 = new JPasswordField();
	    value2.setBounds(150,850,100,30);
        j1.add(value1); j1.add(value2);
           
            
	    JRadioButton r1=new JRadioButton("A) Male"); 
	    JRadioButton r2=new JRadioButton("B) Female");  
	    JRadioButton r3=new JRadioButton("C) Other");
	    r1.setBounds(75,150,100,30); 
	    r2.setBounds(75,200,100,30);
	    r3.setBounds(75,250,100,30);
	    ButtonGroup bg=new ButtonGroup();  
	    bg.add(r1);bg.add(r2);bg.add(r3);  
	    j1.add(r1);j1.add(r2);j1.add(r3);     
	    j1.setSize(300,300);    
	    j1.setLayout(null);    
	    j1.setVisible(true);  
	    
	    JButton b1=new JButton("Submit");  
	    b1.setBounds(50,900,95,30); 
	    JDialog d1 = new JDialog(j1 , "Confirmation", true); 
        d1.setLayout( new GridLayout() );  
	    b1.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e1){  
	    		d1.setVisible(true); 
	    	}  
	    });  
	    
	    JButton b2=new JButton("Already have an account");  
	    b2.setBounds(200,900,250,30); 
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e2) {
	    		Login lg = new Login();
	    	}
	    });
	    
	    JButton b3=new JButton("Close");  
	    b3.setBounds(500,900,95,30);
	    b3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e3) {
	    		System.exit(0);
	    	}
	    });
	    j1.add(b1); 
	    j1.add(b2);
	    j1.add(b3);
	    d1.add( new JLabel ("You have registered successfully!!!"));  
	    d1.setSize(300,300); 
	       
	    
	    JTextArea area=new JTextArea("Enter your permanent Address");  
        area.setBounds(100,360, 200,200);  
        j1.add(area);  
        
        JCheckBox CB1 = new JCheckBox("Knows English");  
        CB1.setBounds(190,590, 150,50);  
        JCheckBox CB2 = new JCheckBox("Knows Hindi");  
        CB2.setBounds(190,640, 200,50);  
        j1.add(CB1);  j1.add(CB2);  
        
        
        String talents[]={"Select","Tailoring","Painting","Carpentry","Writing","Orating", "Sports","Domestic Works","Farming","Beautician","Artist","Dance","Music"};        
        JComboBox cb=new JComboBox(talents);    
        cb.setBounds(100, 300,100,30);    
        j1.add(cb); 
        
        j1.setSize(600,1000);  
        j1.setLayout(null);  
        j1.setVisible(true); 
	    
	}
}

