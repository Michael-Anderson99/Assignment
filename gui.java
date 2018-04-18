package readfile;

import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class gui extends JFrame implements ActionListener, MouseListener
{
	//initialise basic attributes for a screen
	private JButton button1,button2,Button3,Button4;
	private JPanel panel1;
	private JLabel label1;
	
	private JTextField tf1, tf2, tf3, tf4;
	private JFileChooser Fc;
	

	//start the screen and implement the buttons
	gui(String title)
	{	
		
		super(title);
		setSize(600,600);
		setLayout(new FlowLayout());
		
		button1 = new JButton("File 1");
		button2 = new JButton("add");
		button2.addActionListener(this);
		
		button1 = new JButton("Search1");
		button1.addActionListener(this);
		
		tf1 = new JTextField();
		tf1.setColumns(40);
		tf1.setToolTipText("Enter Slang terms to add to the search here");
		tf1.setText("Enter a slang word to search for, if its not there, you can add it yourself below");
		tf1.addActionListener(this);
		tf1.addMouseListener(this);
		
		//JFileChooser Fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		button2 = new JButton("Add1");
		button2.addActionListener(this);
		
		tf2 = new JTextField();
		tf2.setColumns(40);
		tf2.setText("Enter Slang terms to add to the Slang List here");
		tf2.addActionListener(this);
		tf2.addMouseListener(this);
		
		Button3 =new JButton("search2");
		Button3.addActionListener(this);
		
		tf3 = new JTextField();
		tf3.setColumns(40);
		tf3.setText("Enter a formal word to search for, if its not there, you can add it yourself below");
		tf3.addActionListener(this);
		tf3.addMouseListener(this);
		
		Button4 =new JButton("add2");
		Button4.addActionListener(this);
		
		tf4 = new JTextField();
		tf4.setColumns(40);
		tf4.setText("Enter Formal terms to add to the forma word List here");
		tf4.addActionListener(this);
		tf4.addMouseListener(this);
		
		//add(Fc);
		JFileChooser Fc = new JFileChooser();
		Fc.setCurrentDirectory(new java.io.File("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile"));
		Fc.setFileFilter(new FileNameExtensionFilter("Text Document", "txt"));
		Fc.addActionListener(this);
		
		
			int value = Fc.showOpenDialog(gui.this);
			
	        if(value == JFileChooser.APPROVE_OPTION)
	        {
	            File selected = Fc.getSelectedFile();
	            String path = "";
	            path = selected.getAbsolutePath().toString();
	            Readf r1 = new Readf(path);
	            r1.openFile();
	    	    r1.readLine();
	    	    int var = r1.findWordLength();
	    	    System.out.println(var);
	    	    SentencesMethods sm1 = new SentencesMethods(path);
	    	    sm1.openFile();
	    	    sm1.splitToSent();
	    	    int var2 = sm1.findSentLength();
	    	    System.out.println(var2);
	    	    
	    	    if (var > 5 && var2 < 7 )
	    		{
	    			System.out.println("this file Contains slang text");
	    		}
	    		else
	    		{
	    			System.out.println("this file Contains formal text ");
	    		}
	    	    
	    	    /*
	    	    Calculate c1 = new Calculate(path);
	    	    c1.openFile();
	    	    try {
					c1.Formal();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	    try {
					c1.Slang();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	    try {
					c1.file();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	    try {
					c1.scan();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        */
			
	        }//if
	        else
	        	
	        {
	        	System.out.println("dskjvjk");
	        }//else
		
		
		
		
		add(tf1);
		add(button1);
		add(tf2);
		add(button2);
		add(tf3);
		add(Button3);
		add(tf4);
		add(Button4);
		
		setVisible(true);

	}//gui
	
	public void actionPerformed(ActionEvent e) 
	{
		//this if statement calls the addSlang class which takes the users input and adds it to the list of slang words
		if (e.getSource() == button2)
		{
			String add = tf2.getText();
			addSlang called = new addSlang(add);
			called.add();
			JOptionPane.showMessageDialog(this, add + "has been added to file ");
		}//if
		else if(e.getSource() == button1)
		{
			String search = tf1.getText();
			SearchForSlang s = new SearchForSlang(search);
			s.Search();
		}//eif
		else if (e.getSource() == Button4)
		{
			String add = tf4.getText();
			addBusiness called = new addBusiness(add);
			called.add();
			JOptionPane.showMessageDialog(this, add + "has been added to file ");
		}//eif
		else if(e.getSource() == Button3)
		{
			String search = tf3.getText();
			SearchForbusiness s = new SearchForbusiness(search);
			s.Search();
		}//eif
		 else
	     {
	        	System.out.println("dskjv");
	     }
	}//action
		
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getSource() == tf1)
		{
			tf1.setText("");
			
		}
		else if(e.getSource() == tf2)
		{
			tf2.setText("");
			
		}
		else if(e.getSource() == tf3)
		{
			tf3.setText("");
			
		}
		else if(e.getSource() == tf4)
		{
			tf4.setText("");
			
		}
		else
		{
			
		}
		
	}
	
	
	//Setters and Getters
	public JButton getButton1() 
	{
		return button1;
	}



	public void setButton1(JButton button1) 
	{
		this.button1 = button1;
	}



	public JButton getButton2() 
	{
		return button2;
	}



	public void setButton2(JButton button2) 
	{
		this.button2 = button2;
	}



	public JPanel getPanel1() 
	{
		return panel1;
	}



	public void setPanel1(JPanel panel1) 
	{
		this.panel1 = panel1;
	}



	public JLabel getLabel1() 
	{
		return label1;
	}



	public void setLabel1(JLabel label1) 
	{
		this.label1 = label1;
	}



	public JTextField gettf1() 
	{
		return tf1;
	}



	public void setTF1(JTextField tF1) 
	{
	
	}
	



	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	

}