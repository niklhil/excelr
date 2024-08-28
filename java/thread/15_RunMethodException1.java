// Overriding method can not throws broader checked exception. However it can have any unchecked exception

class MyThread extends Thread
{
  public void run() throws ArithmeticException 
  {
      System.out.println("Test");
  }
}







