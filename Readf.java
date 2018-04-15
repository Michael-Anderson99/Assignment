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
//ALWAYS CLOSE FILE WHEN FINISHED READING IT "SCANNERNAME.CLOSE();"
public class Readf
{
	
	
	// Attributes. 
	String fileName;
	File fleExample;
	int avgWordlength = 0;
	int avgSenLength = 0;
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
	}//openFile
	
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
				      
				 }//while
				 String[] split = line1.split(" ");
				 int length = split.length;
				 int i;
				 for(i=0; i<length; i=i+1)
				 {
					 String words = split[i];
					 splitup.add(words); 
				 }//for
			 
			     myScanner.close();
			}//try
			catch (FileNotFoundException e)
			{
				System.out.println(e.getMessage());
			}//catch

		    System.out.println(splitup);
		    return line1;
		    
	} // readLine
	
	//find the average word length for the file
	public void findWordLength()
	{
		int i = 0;
		
		
		for(i = 0; i < splitup.size(); i++)
		{
		  avgWordlength = avgWordlength + splitup.get(i).length();
		}//for

		avgWordlength = avgWordlength / splitup.size();
		System.out.println(avgWordlength);
	}//findWordLength
	
	
	
	//split the file into sentences to calculate average sentence length in other method
	public String findSent()
	{		
		String line1="";
		String[] split1;
		
		try
		{
			
			Scanner myScanner1 = new Scanner(fleExample);
						 
						  
			while (myScanner1.hasNextLine())
			{
				line1 =line1 + myScanner1.nextLine();
						      
			 }//while
			split1 = line1.split("\\.");
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

	//find the average sentence length 
	public int findSentLength()
	{
		int i = 0;
		String words[];
		int wordNum = 0;
		for(i=0; i<findtheSentences.size(); i=i+1)
		{
		    words = findtheSentences.get(i).split(" ");
		    wordNum = wordNum + words.length;
			
		}//for
		
		avgSenLength = wordNum / findtheSentences.size();
		System.out.println(avgSenLength);
	
		return avgSenLength;
		
		
	}//findSentLength()
	
	

    
			
} // end class	  


	

