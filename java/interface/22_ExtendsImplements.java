/* A class can extend one parent class and implement one or more interfaces. */

interface X
{
  void test1();
}

interface Y
{
  void test2();
}

class P
{
  void show()
  {
    System.out.println("show");
  }
}

class C extends P implements X, Y
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
    C obj=new C();
    obj.test1(); 
    obj.test2(); 
    obj.show(); 
  }
}