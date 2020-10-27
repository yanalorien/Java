package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite
{
	public static void main(String[] args) throws FileNotFoundException
	{
// read file
		File readFile = new File("testdata.txt");
		Scanner scanFile =  new Scanner(readFile);
		
		while(scanFile.hasNext())
			System.out.println(scanFile.nextLine());
		scanFile.close();
		
// write file
		File writeFile = new File("write.txt");
		var write = new PrintWriter(writeFile);
		write.println("My first string");
		write.println("My second string");
		write.println("My third string");
		write.close();
	}
}
