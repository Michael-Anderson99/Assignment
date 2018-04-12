/*package readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * A simple example program that reads a text file line by line and display each line.

public class testclass 
{
    public static void main(String[] args) 
    {
        BufferedReader br = null;
        try 
        {
            br = new BufferedReader(new FileReader("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\testfile.txt"));
            String line;
            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
            

            
        } catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null) 
                {
                    br.close();
                }
            } catch (IOException ex) 
            {
                ex.printStackTrace();
            }
        }
    
    
    }
    static int wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    } 

}
	
	

*/
