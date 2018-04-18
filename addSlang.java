
package readfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
/*this class opens a opens a file,
 takes in a string from the gui from user input
 adds it to the file
 */

//ALWAYS CLOSE FILE WHEN FINISHED WITH IT |||||  BUFFERREDWRITERNAME.CLOSE();
public class addSlang 
{
	
	String addToFile;
	
	
	public addSlang(String addToFile) 
	{
		this.addToFile = addToFile;
	}


	public void add() 
	{

		try {
			File file = new File("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Slang.txt");
			FileWriter fwrite = new FileWriter(file.getAbsoluteFile(), true);

			BufferedWriter buff = new BufferedWriter(fwrite);

			buff.write(" " + addToFile);
			buff.close();

		} // try
		catch (Exception ex) {
			System.out.println("exception " + ex.getMessage() + "caught");
		} // catch

	}
}//end class
