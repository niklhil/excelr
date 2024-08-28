/* Protected members of public class are visible throughout the project. 
   Hence they can be inherited any where in the project
*/

public class PublicClassProtectedMembers
{
    protected int x=10;

    protected void show()
    {
       System.out.println("Parent - show()");
    }
}

class Child extends PublicClassProtectedMembers
{
      void test()
      {
          System.out.println(x); //10
          show(); // Parent - show()
      }
}

class Main
{
   public static void main(String args[])
   {
       Child c=new Child();
       c.test();
   }
}