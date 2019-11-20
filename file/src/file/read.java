package file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class read {
	public static void R() throws FileNotFoundException
	{
		Scanner k= new Scanner(new File ("b.txt"));
		while(k.hasNextLine()==true) {
			System.out.println(k.hasNextLine());
		}
		}
	public static void main(String[] args) throws FileNotFoundException
	{
		read.R();
}
	}
