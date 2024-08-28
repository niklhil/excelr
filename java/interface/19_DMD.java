/*
    Interface can not be instantiated. However, we can declare its reference variable.
    Interface reference variable can point to object of the class which implements the same interface.
    We can implement runtime polymorphism using interface reference variable.
*/

interface Drinkable
{
  void drink();
}

class Coffee implements Drinkable
{
  public void drink()
  {
   System.out.println("Coffee");
  }
}

class Tea implements Drinkable
{
  public void drink()
  {
   System.out.println("Tea");
  }
}

class Main
{
  public static void main(String args[])
 {
    Drinkable ref;

    ref=new Coffee();
    ref.drink(); //Coffee

    ref=new Tea();
    ref.drink(); //Tea
  }
}



