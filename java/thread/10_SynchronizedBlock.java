/* synchronized Block approach */

import acclibrary.Account;

class DepositThread implements Runnable
{
  Account ref;

  DepositThread(Account obj){
    ref=obj;
   }

  public void run()
  {
    synchronized(ref)
    { 
      ref.deposit(5000);
    } 
  }
}

class WithDrawThread implements Runnable{

  Account ref;

  WithDrawThread(Account obj){
    ref=obj;
   }

  public void run()
  {
      synchronized(ref)
      {   
        ref.withdraw(5000);
        ref.inquire();
      }
   }
 }

class EnquiryThread implements Runnable{

  Account ref;

  EnquiryThread(Account obj){
    ref=obj;
   }

  public void run()
  {
    synchronized(ref)
    {   
       ref.inquire();
    }
  }
}

class Main
{
  public static void main(String args[]){

     Account accObj=new Account();

     DepositThread deposit=new DepositThread(accObj);
     WithDrawThread withdraw=new WithDrawThread(accObj);
     EnquiryThread enquiry=new EnquiryThread(accObj);

     Thread t1=new Thread(deposit);
     Thread t2=new Thread(withdraw);
     Thread t3=new Thread(enquiry);

     t1.setPriority(10);
     t2.setPriority(5);
     t3.setPriority(1);

     t1.start();
     t2.start();
     t3.start();
  }
}