package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchForbusiness 
{
	String word;

	private ArrayList<String> searchWord = new ArrayList<>();
	
	
	public SearchForbusiness(String word)
	{
		this.word = word;
	}	
	public void Search()
	{
		try
		{
			
			File file = new File("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Business.txt");
			
			Scanner scan = new Scanner(file);
			
			while(scan.hasNext())
			{
				searchWord.add(scan.next());
				
			}//while
			
			if(searchWord.contains(word))
			{
				System.out.println("We found this word in the list of slang words");
			}//if
			else
			{
				System.out.println("not found, please feel free to add it");
	
			}//else
			
			scan.close();
			
		}	
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}//catch
	}	
}
	


