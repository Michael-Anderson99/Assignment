package readfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class addBusiness 
{
	
		
		String addToFile;
		
		
		public addBusiness(String addToFile) 
		{
			this.addToFile = addToFile;
		}


		public void add()
		{
			
			try
			{
				File file = new File("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Business.txt");
				FileWriter fwrite = new FileWriter(file.getAbsoluteFile(),true);
				
		        BufferedWriter buff = new BufferedWriter(fwrite);
		        
		        buff.write(" " + addToFile);
		        buff.close();
				
			}//try
			catch(Exception ex) 
			{
				System.out.println("exception "+ex.getMessage()+"caught");
			}//catch
		

		}
}//end class

