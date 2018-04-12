
package readfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class addSlang 
{
	
	public  addSlang(String fileName)// the constructor just takes in the file name	public Readf (String fileName)
	{
		
		File file = new File(fileName);
	
	{
	try
	{
		
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println("This goes to out.txt");
			
		
	}
		catch(Exception ex) 
		{
			System.out.println("exception "+ex.getMessage()+"caught");
		}
	

	
}	}

}
