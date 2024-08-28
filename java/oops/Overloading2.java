// Method overloading does not consider method return type, access level and modifiers.

class Maths
{
  public final static int sqr(int x)
  {
     System.out.println("int");
     return(x*x);
  }

  double sqr(double x)
  {
     System.out.println("double");
     return(x*x);
  }
}

class Main
{
   public static void main(String args[])
   {
       Maths m=new Maths();
       System.out.println(m.sqr(2)); //4
       System.out.println(m.sqr(3.0));
   }
}






