abstract class BankAccount
{
  abstract void taxCalculation();
  abstract void interestCalculation();
}

class Main
{
  public static void main(String args[])
  {
     BankAccount Obj=new BankAccount(); //CE
  }
}