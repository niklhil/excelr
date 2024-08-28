/* 
    synchronized method approach
    synchronized==threadsafe=Single Threaded
*/

class Account
{
  private double balance;

  Account(){}

  synchronized void deposit(double amt)
   {
     try
     {
        Thread.sleep(500);
     }
     catch(InterruptedException ie)
     {
        ie.printStackTrace();
     }

      balance+=amt;
      System.out.println("Amount deposited : "+amt);
    } 

  synchronized void withdraw(double amt)
   {
     balance-=amt;
  
     try
     {
         Thread.sleep(300);
     }
     catch(InterruptedException ie)
     {
        ie.printStackTrace();
     }

     System.out.println("Amount withdrawn : "+amt);
     System.out.println("Balance after withdrawal: "+balance);
   } 

  synchronized void inquire()
   {
     System.out.println("Balance : "+balance);
   } 
}

class DepositThread implements Runnable
{
  Account ref;

  DepositThread(Account obj){
    ref=obj;
   }

  public void run(){
    ref.deposit(5000);
   }
}

class WithDrawThread implements Runnable
{
  Account ref;

  WithDrawThread(Account obj){
    ref=obj;
   }

  public void run(){
    ref.withdraw(5000);
   }
}

class EnquiryThread implements Runnable
{
  Account ref;

  EnquiryThread(Account obj){
    ref=obj;
   }

  public void run(){
    ref.inquire();
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