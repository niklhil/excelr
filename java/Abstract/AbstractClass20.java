/*Abstract class can have static concrete methods. */

abstract class X
{
  abstract void test();

  static void show()
  {
    System.out.println("show");
  }
}

class Main
{
  public static void main(String args[])
  {
    X.show(); //Show
  }
}