//Abstract class child need to implement all inherited abstract methods

abstract class BankAccount
{
 void show()   			//Concrete method
  {
    System.out.println("Display customer details here");
  }

  abstract void interestCalculation();  	//Abstract method
}

class SBAccount extends BankAccount
{
   void interestCalculation()  //Overriding method
   {
     System.out.println("4% interest calculation");
    }
}

class Main
{
  public static void main(String args[])
  {
     SBAccount sb=new SBAccount();
     sb.show();
     sb.interestCalculation();
  }
}