//Static methods can not use "this" keyword.

class Main
{
   int x=10;   //Data Member

   public static void main(String args[])
   {
       int x=100;  //Local variable

       Main m=new Main();
       System.out.println(m.x); //10

       System.out.println(x);  //100
   }
}