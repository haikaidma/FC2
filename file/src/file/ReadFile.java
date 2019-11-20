package file;
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class ReadFile {
	public static void read() throws FileNotFoundException{
		Scanner kb=new Scanner(new File("src\\file\\k24cmutpm8.txt"));
		while(kb.hasNextLine()==true){
			System.out.println(kb.hasNextLine());
		}
		}
	public static void main(String[] args) throws FileNotFoundException
	{
		ReadFile.read();
		}
	}


