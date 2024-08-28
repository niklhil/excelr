/* If any inherited abstract method is not implemented then the class should be declared abstract */

interface Drinkable
{
  int QTY=1;
  void drink();
  void taste();  
}

class Coffee implements Drinkable  //CE
{
 public void drink()
 {
   System.out.println("Drink your "+QTY+" cup coffee");
 }
}




