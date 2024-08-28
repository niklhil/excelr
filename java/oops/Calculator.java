class Calculator
{
   static int add(int x, int y)
   {
      return(x+y);
   }

   static int subtract(int x, int y)
   {
      return(x-y);
   }
}

class ScientificCalculator extends Calculator
{
     static double sine(double x)
     {
         return Math.sin(x);
     }
}

class FinancialCalculator extends Calculator
{
    static double simpleInterest(double p, double t, double r)
    {
        return((p*t*r)/100);
    }
}

class Main
{
   public static void main(String args[])
   {
      System.out.println(ScientificCalculator.add(1,1));  //2
      System.out.println(ScientificCalculator.subtract(1,1)); //0
      System.out.println(ScientificCalculator.sine(5.0));//

      System.out.println();

      System.out.println(FinancialCalculator.add(1,1)); //2
      System.out.println(FinancialCalculator.subtract(1,1)); //0
      System.out.println(FinancialCalculator.simpleInterest(100000.0, 10,12));
   }
}