/* It is not compulsory to override all inherited abstract methods unless the class need to be instantiated. */

interface Drinkable
{
  int QTY=1;
  void drink();
  void taste();  
}

abstract class Coffee implements Drinkable
{
 public void drink()
 {
   System.out.println("Drink your "+QTY+" cup coffee");
 }
}

class CoffeeChild extends Coffee
{
   public void taste()
   {
     System.out.println("Taste");
   }
}

class Main
{
  public static void main(String args[]){
    CoffeeChild bru=new CoffeeChild();
    bru.drink();
    bru.taste();
  }
}