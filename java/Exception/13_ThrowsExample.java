/* "throws" clause is used in the method header to declare the exception that the method may throw. 
    The method caller need to handle such exceptions using try-catch block */

class Main
{
  public static void main(String args[])
  {
     try
     {
        int res=Calculation.divide();
        System.out.println(res);
     }
     catch(ArithmeticException ae)
     {
       System.out.println("/ Error");
     }
   }
}

class Calculation
{
  static int divide() throws ArithmeticException
  {
    int r=25/0;
    return r; 
  } 
}