class P
{
  static int sqr(int x)
  {
     System.out.println("int");
     return(x*x);
  }

  static double sqr(double x)
  {
     System.out.println("double");
     return(x*x);
  }
}

class C extends P
{
  static long sqr(long x)
  {
     System.out.println("long");
     return(x*x);
  }
}

class Main
{
   public static void main(String args[])
   {
      System.out.println(C.sqr(2));
      System.out.println(C.sqr(3.0));
      System.out.println(C.sqr(4L));
   } 
}