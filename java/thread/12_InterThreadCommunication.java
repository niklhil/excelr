/* wait(), notify(), & notifyAll() can be called only from synchronized methods otherwise causes runtime error 

Here, loops are usedin synchronous methods, to avoid spurious wake-ups, the loop continues to wait by calling wait(). Spurious wake-ups are situations where a thread might wake up from wait() without any apparent notification. By using the while loop, the consumer rechecks the condition (valueSet) after waking up and waits again if it's still `false.
*/

/*  Shared resource  */

class Q
{
  private int n;

  boolean valueSet=false;

  synchronized int get()
  {
    while(!valueSet)
     {
      try
      {
        wait();
      }
      catch(InterruptedException ie)
      {
        ie.printStackTrace();  
      }
    }
    System.out.println("Got : "+n);
    valueSet=false;
    notify();
    return n;
   }

    synchronized void put(int n){

      while(valueSet)
      { 
       try
       {   
           wait();
        }
        catch(InterruptedException ie)
        {
          ie.printStackTrace();  
        }
      }
      this.n=n;
      System.out.println("Put : "+n);
      valueSet=true;
      notify();     
    }
}
/* Producer thread implementation */

class Producer implements Runnable{
  Q qRef;
  
  Producer(Q ref){
    qRef=ref;
   }   

   public void run(){
     int i=1;

     while(true)
     {
       qRef.put(i++);

      try
      { 
          Thread.sleep(1000);
      }
      catch(InterruptedException ie){
        ie.printStackTrace();
       }
     }
   }
 }

/* Consumer thread implementation */

class Consumer implements Runnable{

   Q qRef;

   Consumer(Q ref){
     qRef=ref;
   } 

    public void run(){

      while(true)
      { 
        qRef.get();

        try
        { 
          Thread.sleep(1000);
        }
        catch(InterruptedException ie){
          ie.printStackTrace();
        } 
     }
   }
 }

class Main
{
  public static void main(String args[]){

    System.out.println("Press Ctrl+c to terminate");
   
    Q qObj=new Q();
   
    Producer p=new Producer(qObj);  
    Consumer c=new Consumer(qObj);

    Thread t1=new Thread(p);
    Thread t2=new Thread(c);

    t1.start();
    t2.start();   
  }
}