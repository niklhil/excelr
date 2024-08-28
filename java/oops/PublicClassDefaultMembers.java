/* Protected members of public class are visible throughout the project. 
   Hence they can be inherited any where in the project
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