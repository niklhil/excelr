enum Fruits
{
  APPLE(10), BANANA(40), ORANGE(50), MANGO;

  int price; 

  int getPrice()
  {
     return price;
  }  

  Fruits()
  {
  }  

  Fruits(int p)
  {
    price=p;
  }  
}

class Main
{
   public static void main(String args[])
   {  
     for(Fruits ref : Fruits.values())
     {
        System.out.println(ref +"  " +ref.getPrice()+ "  "+ ref.price);
     }
  }
}