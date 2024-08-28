class Maths
{
   int x=2;

   int compute(int x)  
   {
       return(this.x*x);
   }
}

class Main
{
   public static void main(String args[])
   {
        Maths m=new Maths();
        int result=m.compute(3);
        System.out.println(result); //6
   }
}