interface P
{
  void test1();
}

interface C extends P
{
  void test2();
}

interface GC extends C
{
  void test3();
}

class X implements GC
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
     X obj=new X();
     obj.test1();
     obj.test2();
     obj.test3();
   }
}