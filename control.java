
package readfile;

import java.io.*;
import java.util.Arrays;

public class control 
{
    public static void main(String [] args)
    {
	    Readf r1 = new Readf("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\testfile.txt");
	    r1.openFile();
	    r1.readLine();
	    r1.findWordLength();
	    r1.findSent();
	    r1.findSentLength();
	    addSlang AS1 = new addSlang("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\addSlang.txt");
	    
	    gui g1 = new gui("screen");
   
   
    }//close main
    
}//close class