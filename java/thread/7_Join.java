class ChildThread implements Runnable
{
  public void run()
  {
    System.out.println("Child starts...");

    for(int i=1;i<=10;i++)
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
  }
}

class Main     
{
  public static void main(String args[])
  {
    System.out.println("Main starts...");

    ChildThread ct=new ChildThread();
    Thread t=new Thread(ct); 
    t.start();
    
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

         try
         { 
           t.join();     
         }
         catch(InterruptedException ie)
         {
           ie.printStackTrace();
          }
      } 
   }
}