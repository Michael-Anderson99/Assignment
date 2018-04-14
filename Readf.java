package readfile;
//the file opening elements of this code are taking from the lab solutions from week 7 on webcourses
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 The purpose of this class is to:
 A)-Open a file
 B)-Read the words of a file into an Array List to (1)find average word length and (2)scan for slang words
 C)-Add each sentence in a file to a separate Array List to determine average sentence length
 
 Slang is determined by:
 Shorter average word length
 Shorter sentence length
 How many slang terms are in the file
 */
public class Readf
{
	
	
	// Attributes. 
	String fileName;
	File fleExample;
	private ArrayList<String> splitup = new ArrayList<>();
	private ArrayList<String> findtheSentences = new ArrayList<>();
	
	public  Readf(String fileName)// the constructor just takes in the file name	public Readf (String fileName)
	{
		this.fileName = fileName;
	}
	
	// open/ connect to the file. 
	public void openFile()
	{
		fleExample = new File(fileName);
	}
	
	// read the text file and add the words to an array  list individually
	public String readLine()
	{		
			String line1="";
		    try
			{
			     // I don't need the scanner in any other method, so I can create it here.
				 Scanner myScanner = new Scanner(fleExample);
				 
				  
				 while (myScanner.hasNextLine())
				 {
				      line1 =line1 + myScanner.nextLine();
				      
				 }
				 String[] split = line1.split(" ");
				 int length = split.length;
				 int i;
				 for(i=0; i<length; i=i+1)
				 {
					 String words = split[i];
					 splitup.add(words); 
			 }
			 
			myScanner.close();
			}
			catch (FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

		    System.out.println(splitup);
		    return line1;
		    
	} // readLine
	
	public void findWordLength()
	{
		int i = 0;
		int avglength = 0;
		
		for(i = 0; i < splitup.size(); i++)
		{
		  avglength = avglength + splitup.get(i).length();
		}

		avglength = avglength / splitup.size();
		System.out.println(avglength);
	}
	
	public String findSent()
	{		
		String line1="";
		try
		{
			
			Scanner myScanner1 = new Scanner(fleExample);
						 
						  
			while (myScanner1.hasNextLine())
			{
				line1 =line1 + myScanner1.nextLine();
						      
			 }//while
			String[] split1 = line1.split("\\.");
			int length = split1.length;
			int j ;
						 
			for(j=0; j<length; j=j+1)
			{
				String words = split1[j];
				findtheSentences.add(words); 
			}//for
						 
			myScanner1.close();
			
		}//try
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}//catch
			    

		System.out.println(findtheSentences);
		return line1;
	 }//findsent

	
	

    
			
} // end class	  


	

