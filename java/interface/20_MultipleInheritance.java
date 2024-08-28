/* Multiple inheritance can be achieved by using interface. */

interface X
{
  void test1(); 
}

interface Y
{
  void test2(); 
}

interface Z extends X, Y    //Multiple Inheritance
{
  void test3();
}

class C implements Z
{
   public void test1()
   {
     System.out.println("Test1");
   }

   public void test2()
   {
     System.out.println("Test2");
   }

   public void test3()
   {
     System.out.println("Test3");
   }
}

class Main
{
  public static void main(String args[])
  {
    C obj=new C();
    obj.test1();
    obj.test2();
    obj.test3();
  }
}