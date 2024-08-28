class Parent
{
   public int x=10;       //Public members of a default class are visible only within the same package. Hence they can be inherited only within the same package.
   protected int y=20;  //Protected members of a default class are visible only within the same package. Hence they can be inherited only within the same package.
   int z=30;                 // Default members of a default class are visible only within the same package. Hence they can be inherited only within the same package.
   private int k=40;      // Private memebers are visible only within the same class. Hence they are never inherited.
}

class Child extends Parent
{
   void test()
   {
       System.out.println(x); //10
       System.out.println(y); //20
       System.out.println(z); //30
       //System.out.println(k); //CE
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
