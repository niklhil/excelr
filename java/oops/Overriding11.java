// Overriding method should have same or stronger access level w.r.t the overridden methods

class P
{
   protected void test()   //Overridden method
   {
       System.out.println("P - test()");
   }
}

class C extends P
{
   protected void test()    //Overriding method
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
