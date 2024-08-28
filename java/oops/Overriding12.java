// Private methods can not be overridden since they are not inherited.

class P
{
   private void test()   
   {
       System.out.println("P - test()");
   }
}

class C extends P
{
   public void test()   //This is not overriding method
   {
       System.out.println("C - test()");
   }
}

class Main
{
    public static void main(String args[])
    {
        P p=new P();
        p.test();  //CE

        C c=new C();
        c.test(); 
    }
}
