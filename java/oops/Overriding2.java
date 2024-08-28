//Overriding method should have same or sub-type of overridden method's return type.

class P
{
   Object test()   //Overridden method
   {
       System.out.println("P - test()");
       return new Object();
   }
}

class C extends P
{
   String test()  //Overriding method
   {
       System.out.println("C - test()");
       return new String();
   }
}

class Main
{
    public static void main(String args[])
    {
        P p=new P();
        p.test();  //P - test()

        C c=new C();
        c.test(); //C - test()  
    }
}

