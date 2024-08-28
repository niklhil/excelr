//Non-static method can't be overridden by a static method

class P
{
  void test()   
   {
       System.out.println("P - test()");
   }
}

class C extends P
{
   static void test() //CE
   {
       System.out.println("C - test()");
   }
}

class Main
{
    public static void main(String args[])
    {
        P p=new P();
        p.test();  

        C c=new C();
        c.test(); 
    }
}
