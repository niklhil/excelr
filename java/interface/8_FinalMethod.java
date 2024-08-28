/* Undefined methods of interface can not be final. */

interface Drinkable
{
      int QTY=1;
      final void drink();  //CE  
      final void taste();  //CE 
}








