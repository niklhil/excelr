/* Public members of public class are visible throughout the project. 
   Hence they can be inherited any where in the project
*/

public class PublicClassPublicMembers
{
    public int x=10;

    public void show()
    {
       System.out.println("Parent - show()");
    }
}

class Child extends PublicClassPublicMembers
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











