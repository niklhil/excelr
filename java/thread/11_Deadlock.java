/*  
Deadlock describes a condition in which two or more threads are blocked (hung) forever because each thread is waiting for a resource that is held by another thread. Deadlock occurs when multiple threads need the same locks but obtain them in different order. A Java multithreaded program may suffer from the deadlock condition because the synchronized keyword causes the executing thread to block while waiting for the lock, or monitor, associated with the specified object.

A deadlock mainly happens when we give locks to multiple threads. Hence, we should avoid giving locks to other threads if it is already given to one.

*/

class X 
{
  synchronized void test(Y y) 
  {
     String name = Thread.currentThread().getName();
     System.out.println(name + " entered X.test()");

     try
     {
       Thread.sleep(1000);
     }
     catch(InterruptedException e) 
     {
        e.printStackTrace();
     }

     System.out.println(name + " calling Y.last()");
     y.last();
   }
  
   synchronized void last() 
   {
     System.out.println("Inside X.last");
   }
}

class Y 
{
   synchronized void test(X x)
   {
     String name = Thread.currentThread().getName();
     System.out.println(name + " entered Y.test");
     
     try 
     {
       Thread.sleep(1000);
     }
     catch(InterruptedException e) 
     {
        e.printStackTrace();
     }

     System.out.println(name + " trying to call X.last()");
     x.last();
   }

   synchronized void last() 
   {
     System.out.println("Inside Y.last");
   }
}

class ChildThread implements Runnable
{
   X x;
   Y y;

   ChildThread(X x,Y y)
   {
     this.x=x;
     this.y=y;
   }

   public void run() 
   {
     y.test(x); // Child thread gets lock on y object
     System.out.println("Back in other thread");
   }
}

class Main
{
   public static void main(String args[])
   {
      X x = new X();
      Y y = new Y();

      ChildThread m=new ChildThread(x,y); 
      Thread t = new Thread(m, "child");
      t.start();

      x.test(y); // main thread gets lock on x object
      System.out.println("Back in main thread");
   }
}