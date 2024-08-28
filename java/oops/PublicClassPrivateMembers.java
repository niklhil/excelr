/* Private members are visible only within the same class. Hence, they are never inherited. */

public class PublicClassPrivateMembers
{
   private int x=10;

   private void show()
    {
       System.out.println("Parent - show()");
    }
}

class Child extends PublicClassPrivateMembers
{
      void test()
      {
          System.out.println(x); //CE
          show(); // CE
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