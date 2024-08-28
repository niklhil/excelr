class P
{
   int x=10;
 
   void show()
   {
     System.out.println("Welcome");
   }
}

class C extends P
{
   void test()
    {
        System.out.println(x); //10
        show(); //Welcome
    }
}

class Main
{
   public static void main(String args[])
   {
      C c=new C();
      c.test();	     
   }
}







