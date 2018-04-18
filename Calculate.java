package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Calculate 
{
	
	int AverageWordLength = 0;
	int AverageSenLength = 0;
	int SlangCounter = 0;
	int FormalCounter = 0;
	
	// Attributes. 
	String fileName;
	File file;
	
	
	int avgWordlength = 0;
	
	private ArrayList<String> WholeFile = new ArrayList<>();
	private ArrayList<String> SlangFile = new ArrayList<>();
	private ArrayList<String> FormalFile = new ArrayList<>();

	
	
	public  Calculate(String fileName)// the constructor just takes in the file name	public Readf (String fileName)
	{
		this.fileName = fileName;
	}
	
	// open/ connect to the file. 
	public void openFile()
	{
		file = new File(fileName);
	}//openFile
	
	public void Formal() throws FileNotFoundException
	{
		String line1 ="";

		 // I don't need the scanner in any other method, so I can create it here.
		 Scanner myScanner = new Scanner("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Business.txt");

		 while (myScanner.hasNextLine())
		 {
		      line1 =line1 + myScanner.nextLine();
		      
		 }//while
		 String[] split = line1.split(" ");
		 int length = split.length;
		 int i;
		 for(i=0; i<length; i=i+1)
		 {
			 String words = split[i];
			 FormalFile.add(words); 
		 }//for
 
		 myScanner.close();
		
	}
	public void Slang() throws FileNotFoundException
	{
		String line1 ="";

		 // I don't need the scanner in any other method, so I can create it here.
		 Scanner myScanner = new Scanner("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Slang.txt");

		 while (myScanner.hasNextLine())
		 {
		      line1 =line1 + myScanner.nextLine();
		      
		 }//while
		 String[] split = line1.split(" ");
		 int length = split.length;
		 int i;
		 for(i=0; i<length; i=i+1)
		 {
			 String words = split[i];
			 SlangFile.add(words); 
		 }//for
 
		 myScanner.close();
		
	}
	public void file() throws FileNotFoundException
	{
		String line1 ="";

		 // I don't need the scanner in any other method, so I can create it here.
		 Scanner myScanner = new Scanner(fileName);

		 while (myScanner.hasNextLine())
		 {
		      line1 =line1 + myScanner.nextLine();
		      
		 }//while
		 String[] split = line1.split(" ");
		 int length = split.length;
		 int i;
		 for(i=0; i<length; i=i+1)
		 {
			 String words = split[i];
			 WholeFile.add(words); 
		 }//for
 
		 myScanner.close();
		
	}
	
	public void scan() throws FileNotFoundException
	{
		int i = 0;
	
		Scanner sc = new Scanner("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Slang.txt");
		Scanner sc2 = new Scanner(fileName);
		
		while (sc2.hasNext())
		{
			//String next = sc.next();
			
			while(WholeFile.get(i) == SlangFile.get(i))
			{
				SlangCounter = SlangCounter + 1;
				i = i+1;
			}
				
					
		}
		
		if (SlangCounter > 3 && AverageWordLength < 5 )
		{
			System.out.println("this file Contains slang text");
		}
		else
		{
			System.out.println("this file Contains formal text text");
		}
		
		System.out.println("the amount of slang is " +SlangCounter);
		sc.close();
		sc2.close();
	}
	
	
	
	
	
	
	
	

}
