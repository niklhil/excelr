// throw keyword is used to throw exception explicitly.

class Main
{
  public static void main(String args[])
  {
    System.out.println("Main starts..."); 

     try
     {
     
      {
        throw new ArithmeticException();     
      }
     System.out.println("Test"); 
    }    
    catch(ArithmeticException ae)
    {
      System.out.println("Division error");
    }
  }
}