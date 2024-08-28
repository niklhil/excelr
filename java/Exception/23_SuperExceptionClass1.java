/*
   Try block with multiple catch blocks should have the catch blocks in ascending order of the exception hierarchy
*/

class Main
{
   public static void main(String args[])
  {
    try
    {
      int y=0;
      int r=25/y;

      int x[]={1,2,4};
      System.out.println(x[r]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error");
    }    
    catch(ArithmeticException ae)
    {
      System.out.println("/ Error");
    } 
    catch(Exception e)
    {
       e.printStackTrace();
    } 
  }
}