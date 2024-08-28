//All concrete methods

abstract class BankAccount
{
  void show()
  {
    System.out.println("Display customer details here");
  }

  void interestCalculation()
  {
    System.out.println("You will get interest on your deposit"); 
  }
}

class Main
{
  public static void main(String args[])
  {
     BankAccount Obj=new BankAccount(); //CE 
  }
}