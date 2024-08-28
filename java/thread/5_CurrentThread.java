/* public static Thread currentThread() */

class ChildThread implements Runnable 
{
   public void run() 
   {
     System.out.println("Child Thread - run()");
   }
}

class Main
{
  public static void main(String args[])
  {
    ChildThread ct=new ChildThread();
    Thread t=new Thread(ct);
    t.start();

    //Thread t1=t.currentThread(); 
    Thread t1=Thread.currentThread(); 

    System.out.println(t1);
    System.out.println(t1.getName());
    System.out.println(t1.getPriority());
    System.out.println(t1.isAlive());
    System.out.println(t.isAlive());
  }
}