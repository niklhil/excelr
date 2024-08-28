// Overriding method should have same or stronger access level w.r.t the overridden methods

class P
{
   public void test()   
   {
       System.out.println("P - test()");
   }
}

class C extends P
{
   protected void test()    //CE
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
