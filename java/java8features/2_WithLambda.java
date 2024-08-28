interface Payment
{
    void Pay();
}
 class Main
{
    public static void main(String args[])
    {
        Payment p=()->{
                          System.out.println("Your payment is nil");
                       };
                 p.Pay();
   }
}