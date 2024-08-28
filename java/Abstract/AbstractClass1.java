//Abstract class can't be instantiated

abstract class BankAccount
{
  void show()  // Concrete method
  {
    System.out.println("Display customer details here");
  }

  abstract void interestCalculation();  // Abstract method
}

class Main
{
  public static void main(String args[])
  {
    BankAccount Obj=new BankAccount(); //CE
  }
}