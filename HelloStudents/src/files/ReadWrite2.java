package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite2
{
	public static void main(String[] args) 
	{

		File readFile = new File("testdata.txt");
		File writeFile = new File("write.txt");
		
		try(var scanFile =  new Scanner(readFile); 
				var write = new PrintWriter(writeFile))
		{
			while(scanFile.hasNext())
				System.out.println(scanFile.nextLine());
		
			write.println("My first string");
			write.println("My second string");
			write.println("My third string");
		}
		catch(FileNotFoundException e) 
		{
			System.out.println(e);
		}
	}
}
