/* Interface can have static / private concrete method. */

interface Test
{
  double PI=3.142;

  void test();

  static void show() //Static concrete method
  {
    System.out.println("Show");
  } 

  private void display() //private non-static concrete method
  {
    System.out.println("Display");
  }
}

class Main
{
  public static void main(String args[])
  {
      Test.show();
  }
}