
package readfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
//this class opens a opens a file
//ALWAYS CLOSE FILE WHEN FINISHED WITH IT |||||  BUFFERREDWRITERNAME.CLOSE();
public class addSlang 
{
	
	public  addSlang(String fileName)// the constructor just takes in the file name	public Readf (String fileName)
	{
		
		File file = new File(fileName);
	
	{
	try
	{
		
		String addToFile = "hello";
		
		FileWriter fwrite = new FileWriter(file.getAbsoluteFile(),true);
		
        BufferedWriter buff = new BufferedWriter(fwrite);
        
        buff.write(addToFile);
        buff.close();
		
	}//try
	catch(Exception ex) 
	{
		System.out.println("exception "+ex.getMessage()+"caught");
	}//catch
	

	
}	}}
