//Here  return types are neither same nor they have parent child relationship

{
   double test()   
   {
       System.out.println("P - test()");
       return 0.0;
   }
}

class C extends P
{
   float test()  //CE
   {
       System.out.println("C - test()");
       return 0.0f;
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

