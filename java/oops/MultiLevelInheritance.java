class P
{
    int x=10;

    void show()
    {
       System.out.println("P - show()");
    } 
}

class C extends P
{
    int y=20;
 
    void display()
    {
       System.out.println("C - display()");
    }
}

class GC extends C
{
    void test()
    {
       System.out.println(x); //10  
       show();  // P - show()

       System.out.println(y);  //20
       display();  // C - display()
    }
}

class Main
{
   public static void main(String args[])
   {
       GC gc=new GC();
       gc.test();
   }
}