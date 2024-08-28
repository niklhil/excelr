/* To  read character data from a  file */

import java.io.*;

class Main
{
  public static void main(String args[]){
   
   try{ 
        FileReader fr=new FileReader("readme.txt");
        BufferedReader br=new BufferedReader(fr);

        int c=br.read();  
        
        while(c!= -1)
        {
          System.out.print((char)c);
          c=br.read();
        }

         fr.close();
         br.close();
       }
       catch(FileNotFoundException fe)
       {
         System.err.println("File not found...");
       }
       catch(IOException ioe)
       {
          ioe.printStackTrace();
       }
     }
 }