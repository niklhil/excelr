import java.io.IOException;

class Main
{
   public static void main(String args[])
   {
     try
     {
       System.out.println("Hi");
     }
     catch(IOException ioe) 
     {
       ioe.printStackTrace();
     }
   }
}