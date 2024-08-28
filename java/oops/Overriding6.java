//Overriding method should have same or sub-type of overridden method's return type.

class P
{
   String test()   //
   {
       System.out.println("P - test()");
       return new String();
   }
}

class C extends P
{
   Object test()  //CE
   {
       System.out.println("C - test()");
       return new Object();
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

