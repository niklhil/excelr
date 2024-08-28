class ChildThread extends Thread
{
     public void run()
     {
        System.out.println("Child started...");

        for(int i=1; i<=5; i++)
        {
           System.out.println("Child : "+i);
   
           try
           {
              sleep(500); 
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

       ChildThread t1=new ChildThread();
       t1.start(); 

       for(int i=1; i<=5; i++)
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
    }
}
