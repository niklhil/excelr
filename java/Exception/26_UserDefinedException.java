import java.util.Scanner;

class Main
 {
    public static void main(String[] args) {
        double balance = 1000.0;

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scr.nextDouble();  

        try
         {
            if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds, try again!!!");
            }
         } 
        catch (InsufficientFundsException e) {
           System.out.println(e.getMessage());
           main(null);
           return;
        }

        System.out.println("Collect your cash : "+amount);
   }
}