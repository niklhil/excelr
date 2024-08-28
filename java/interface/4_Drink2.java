/* If all inherited abstract methods of interface are not overridden then the class should be declared abstract */

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