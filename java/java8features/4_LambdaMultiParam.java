interface Payment
{
   void pay(double amt,double tax);
}

class Main
{
   public static void main(String args[])
   {
       Payment p=(amount,tax)->{
                                                               amount=amount-tax;
                                                              System.out.println("Your final payment is Rs."+amount);
                                                             };
           p.pay(11500.0,1500.0);
    }
}
