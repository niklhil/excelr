class P
{
   void greet()
   {
      System.out.println("Hello");
   }
}

class C1 extends P
{
  void greet()
   {
      System.out.println("Good morning");
   }
}

class C2 extends P
{
  void greet()
   {
      System.out.println("Good afternoon");
   }
}

class GC extends C1, C2   //CE
{
    void test()
    {
         greet(); 
    }
}

















