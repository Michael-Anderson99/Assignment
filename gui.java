package readfile;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JFileChooser;

public class gui extends JFrame implements ActionListener, MouseListener
{
	//initialise basic attributes for a screen
	private JButton button1,button2;
	private JPanel panel1;
	private JLabel label1;
	private JTextField tf1;
	

	//start the screen and implement the buttons
	gui(String title)
	{
		super(title);
		setSize(600,600);
		setLayout(new FlowLayout());
		
		button1 = new JButton("File 1");
		button2 = new JButton("FIle 2");
		tf1 = new JTextField("Enter Slang to add to the file");
		
		JFileChooser Fc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		
		add(Fc);
		add(button1);
		add(button2);
		setVisible(true);
	}
	public JButton getButton1() 
	{
		return button1;
	}



	public void setButton1(JButton button1) {
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
		tf1 = tf1;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}



}
