/* Finally block is entered even after the execution of return statement. */

class Main
{
  public static void main(String args[])
  {
     System.out.println("Main starts...");

     try
     {
       System.out.println("Try starts");
       int r=24/2; 
       if(2>1)
       {
        return;
       }
       System.out.println("try ends");
     }
     catch(ArithmeticException ae)
     {
      System.out.println("Catch block");
     }
     finally
     {
       System.out.println("finally block");
     }

     System.out.println("Main ends");
  }
}