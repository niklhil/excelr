//Static methods can not use "this" keyword.

class Main
{
   int x=10;   //Data Member

   public static void main(String args[])
   {
       int x=100;  //Local variable
       System.out.println(this.x); //CE
   }
}