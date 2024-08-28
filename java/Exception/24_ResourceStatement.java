//Resource Declaration Statement  / Resource Statement

import java.io.*;

class Main
{
  public static void main(String args[])
  {
    try(FileInputStream fis=new FileInputStream("readme.txt"))
    { 
      	int c=fis.read();   

	while(c!=-1)
    	{
      	  System.out.print((char)c);
     	  c=fis.read(); 
      	}
    }
    catch(FileNotFoundException fne)
    {
      System.out.println("readme.txt not found");
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  }
}