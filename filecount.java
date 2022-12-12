import java.util.*;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandler {
	
	public static void main(String []args)
	{
		try{
			FileReader f = new FileReader("sample.txt");
			int x;
			x= f.read();
			int nChars=0;
			int nWords=0;
			int nLines=0;
			while(x!=-1)
			{
				
				if(x == ' ')
					nWords++;
				else if(x =='\n'){
					nLines++;
					nWords++;
					}
				else nChars++;
					
				x=f.read();	
			}
			System.out.println("Char : " + nChars + "   Words : " +nWords  +  " Lines :"+nLines);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
		}
		catch(IOException e)
		{
			System.out.println("Something went wrong");
		}
		
	}
}
