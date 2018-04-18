package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*the purpose of this class is:
 A)-Add each sentence in a file to a separate Array List
 B)-To determine average sentence length
 */
public class SentencesMethods 
{
	String fileName;
	File fleExample;
	int avgSenLength = 0;
	private ArrayList<String> findtheSentences = new ArrayList<>();
	
	public  SentencesMethods(String fileName)// the constructor just takes in the file name	public Readf (String fileName)
	{
		this.fileName = fileName;
	}
	
	// open/ connect to the file. 
	public void openFile()
	{
		fleExample = new File(fileName);
	}//openFile
	
	//split the file into sentences to calculate average sentence length in other method
	public String splitToSent()
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
				words.toLowerCase();
			}//for
				
			myScanner1.close();
				
		}//try
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}//catch
				    
		
		return line1;
	}//split to sent

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
		//System.out.println(avgSenLength);
		System.out.println("gobbeldegoook");
		return avgSenLength;

	}//findSentLength()
		

}
