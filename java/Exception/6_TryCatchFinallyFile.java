/*
    Finally block is used to release the external resources used in try-catch block.
    It may contain code for closing connections, closing files, or freeing up threads. 
    It executes whether or not exception occurs in the program. 
    Finally block is not entered if System.exit() is executed.
*/

import java.io.*;

class Main
{
  public static void main(String args[])
  {
    FileInputStream fis=null;

    try
    { 
        fis=new FileInputStream("readme.txt");
        int c=fis.read();  

	while(c!=-1)
	{
      	   System.out.print((char)c);  
      	   c=fis.read(); 
    	}
    }
    catch(FileNotFoundException fne)
    {
      System.out.println("readme.txt file is not found");
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
    finally
    {
      try 
        {
          if(fis!=null)
          {
            fis.close();
          }
        }
      catch(IOException ioe)
      {
         System.out.println("Catch block in Finally block");
      }  
    }
  }
}