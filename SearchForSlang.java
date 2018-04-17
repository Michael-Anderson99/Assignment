package readfile;
/*
	The purpose of this class is to take user input from the gui and then search the word in the slang text file and print a message based on whether
	or not its there
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchForSlang 
{
	
	String word;

	private ArrayList<String> searchWord = new ArrayList<>();
	
	
	public SearchForSlang(String word)
	{
		this.word = word;
	}
	
		public void Search()
		{
			try
			{
				
				File file = new File("C:\\Users\\Michael\\Documents\\College\\Y2 S2\\OOP\\readfile\\src\\readfile\\Files\\Slang.txt");
				
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
