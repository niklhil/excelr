import java.util.Scanner;

class Main
 {
    public static void main(String[] args) {
        int pin = 1234;

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter the pin: ");
        int atm = scr.nextInt();  

        try
         {
            if (atm == pin) {
                throw new InvalidException("Invalidpin, try again!!!");
            }
         } 
        catch (InvaldException e) {
           System.out.println(e.getMessage());
           main(null);
           return;
        }

        System.out.println("sucessfully matched your pin : "+atm);
   }
}