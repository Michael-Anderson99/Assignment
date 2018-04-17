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
 B)-Read the words of a file into an Array List to (1)find average word length 
 
 
 Slang is determined by:
 Shorter average word length
 Shorter sentence length
 How many slang terms are in the file and the frequency of detected "bad" words in the file
 */
//I downloaded the file full of bad words (Slang.txt) off the internet and added to it myself in testing the program

//ALWAYS CLOSE FILE WHEN FINISHED READING IT "SCANNERNAME.CLOSE();"
public class Readf
{
	
	
	// Attributes. 
	String fileName;
	File fleExample;
	
	int avgWordlength = 0;
	
	private ArrayList<String> splitup = new ArrayList<>();
	
	private ArrayList<String> searchWord = new ArrayList<>();
	
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
	

	

    
			
} // end class	  


	

