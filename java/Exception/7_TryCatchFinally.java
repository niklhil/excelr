// finally block executes always, except when System.exit(0) is encountered

class Main
{
  public static void main(String args[])
  {
    System.out.println("Main Starts...");

    try
    {
      int x=25/0;
      System.out.println("Result : "+x);
    } 
    catch(ArithmeticException ae)
    {
      System.out.println("Division error");
    }
    finally
    {
      System.out.println("finally block");
    }
    System.out.println("Main ends");
  }
}