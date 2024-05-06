import java.io.*;
import java.util.*;

class FileExample
{
	public static void main(String args[])  
  {
	  System.out.println("Hello");
	  Scanner sc = new Scanner(System.in);
	  sc.nextLine();
	  File file = new File("xyz.txt");
	  try
    {
	    file.createNewFile();
	    System.out.println("a");
	  }
	  catch(Exception e)
    {
	    System.out.println("File Not Created");
	  }
	  finally
    {
	    System.out.println("Finalized");
	  }
	}
}
