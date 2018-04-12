
package readfile;

import java.io.*;
import java.util.Arrays;

public class read 
{
    public static void main(String [] args) 
    {

        // declares file that i want to open
        String fileName = "C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\Assignment\\src\\testfile.txt";

        //starts reading the file from the start and reads line by line
        String line = null;

        try 
        {
        	
            // FileReader reads text files in the default encoding.
            FileReader fileReader =  new FileReader(fileName);
            
            //fileName.split(" ");

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
                System.out.println(line);
            }   
            

            //String[] arr = new String[] {fileName.toString()};
            //System.out.println((Arrays.deepToString(arr)));
            

            // Always close files.
               bufferedReader.close();         
        }//close try
        catch(FileNotFoundException ex) 
        {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }//close catch
        catch(IOException ex) 
        {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
            
        }//close catch
        
    }//close main
    
}//close class