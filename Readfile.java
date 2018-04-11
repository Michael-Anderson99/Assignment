import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Readfile
{

	// Attributes. 
	String fileName;
	File fleExample;
	
	// the constructor just takes in the file name
	public Readfile (String fileName)
	{
		this.fileName = fileName;
	}
	
	// open/ connect to the file. 
	public void openFile()
	{
		fleExample = new File(fileName);
	}
	
	// read a line from the file, return the line as a String
	public String readLine()
	{		
			String line = "no line in file";
		    try
			{
		     // I don't need the scanner in any other method, so I can create it here.
			 Scanner myScanner = new Scanner(fleExample);
			 
			  
			 if (myScanner.hasNextLine())
			    {
			      line = myScanner.nextLine();
			      System.out.println ("I read this line " + line);
			    }

			myScanner.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

		   System.out.println(line);
		    return line;
			  
			  
	} // readLine

	

} // end class	  


	

