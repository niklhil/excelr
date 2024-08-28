/*
   A class may implement many interfaces.
   Many classes can implement same interface.
*/

interface X
{
   void test1();
}

interface Y
{
   void test2();
}

class XY implements X, Y
{
   public void test1()
   {
      System.out.println("Test1");
   }

   public void test2()
   {
      System.out.println("Test2");
   }
}

class Main
{
   public static void main(String args[])
  {
      XY obj=new XY();
      obj.test1();
      obj.test2();
  }
}