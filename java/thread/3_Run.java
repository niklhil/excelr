class ChildThread implements Runnable
{
   public void run()
   {
    System.out.println("Child Starts...");
    
    for(int i=1;i<=5;i++)
    {
      System.out.println("Child : "+i);
 
      try
      {
        Thread.sleep(500); 
      }
      catch(InterruptedException ie)
      {
         ie.printStackTrace();
      }
    }

    System.out.println("Child ends...");
   }
}

class Main
{
  public static void main(String args[])
  {
    System.out.println("Main starts...");

    ChildThread obj=new ChildThread();
    Thread t=new Thread(obj);
     t.run(); 
   
    for(int i=1;i<=5;i++)
    {
      System.out.println("Main : "+i);

      try
      {
        Thread.sleep(500); 
      }
      catch(InterruptedException ie)
      {
         ie.printStackTrace();
      }
    }
 
    System.out.println("Main ends...");
  }
}