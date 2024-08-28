package acclibrary;

public class Account
{
   private double balance;

   public Account(){}

   public void deposit(double amt){

     try{
           Thread.sleep(500);
        }
      catch(InterruptedException ie){
        ie.printStackTrace();
       }

      balance+=amt;
      System.out.println("Amount deposited : "+amt);
    } 

    public void withdraw(double amt){

      balance-=amt;				
     
     try{
           Thread.sleep(300);
        }
      catch(InterruptedException ie){
        ie.printStackTrace();
       }

      System.out.println("Amount withdrawn : "+amt);
    } 

   public void inquire()
   {
      System.out.println("Balance : "+balance);
   } 
}