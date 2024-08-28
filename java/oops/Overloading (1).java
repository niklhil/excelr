class Maths
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
       System.out.println(Maths.sqr(2));    //4
       System.out.println(Maths.sqr(3.0)); //9.0
       System.out.println(Maths.sqr(4L));    //16
   }
}