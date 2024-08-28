// Single Abstract Method (SAM) interface/ functional interface


interface Payment
{
    void pay(double amt);
}

class Main
{
    public static void main(String args[])
     {
        Payment p=(amount)->{
                                System.out.println("Your payment is Rs."+amount);
                            };
           p.pay(250.0);
   }
}