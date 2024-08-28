/* Default members of public class are visible only within the same package. 
   Hence they can be inherited only within the same package.
*/

public class PublicClassDefaultMembers
{
    int x=10;

    void show()
    {
       System.out.println("Parent - show()");
    }
}

class Child extends PublicClassDefaultMembers
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