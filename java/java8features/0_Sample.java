interface Payment
{  
    void pay();  
}

class PaymentImplementation implements Payment
{
   public void pay()
   {
     System.out.println("Hello");
   }
}

class Main
{
  public static void main(String args[])
  {
    PaymentImplementation pi=new PaymentImplementation();
    pi.pay();
  }
}