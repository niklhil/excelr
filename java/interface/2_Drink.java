/* Interface method should be declared public, when it is implemented */

interface Drinkable
{
  int QTY=1;
  void drink();
  void taste();  
}

class Coffee implements Drinkable
{
 public void drink()
 {
   System.out.println("Drink your "+QTY+" cup coffee");
 }

 public void taste()
 {
   System.out.println("Taste your coffee");
 }
}

class Main
{
   public static void main(String args[])
   {
      Coffee bru=new Coffee();
      bru.drink();
      bru.taste();
   }
}