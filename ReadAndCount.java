/*package readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//the purpose of this class is to read in the file and count the amount of words

public class ReadAndCount 
{
	 public static void main(String [] args)
	 {

	
	// declares file that i want to open
    String fileName = "C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\testfile.txt";

    //starts reading the file from the start and reads line by line
    String line = null;
    
    {
    try 
    {
        // FileReader reads text files in the default encoding.
        FileReader fileReader = 
        new FileReader(fileName);
        

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
        new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) 
        {
            System.out.println(line);
        }   
       
        String sampleSentence = fileName;
        String[] words = sampleSentence.split(" ");
        int itemCount = words.length;
        System.out.println("The number of words is: " + itemCount);
        
     

           // Always close files.
           bufferedReader.close();         
    }//close try
    
    catch(FileNotFoundException ex) 
    {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }//close catch
    
    catch(IOException ex2) 
    {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
        // Or we could just do this: 
        // ex.printStackTrace();
        
    }//close catch
}
}
}
	
	
	*/
	

