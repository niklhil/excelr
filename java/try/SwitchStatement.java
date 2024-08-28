import java.util.Scanner;
class Nila
{
  public static void main(String args[])
  {
     Scanner scr = new Scanner(System.in);
     string day;

     System.out.println("Enter day");
     string userinput = scr.nextLine();
     

     switch(day)
     {
         case "SUN":
           System.out.println("Sunday");
         break;

         default:
           System.out.println("Invalid entry");
         break;


         case "MON":
            System.out.println("Monday");
         break;


         case "TUE":
            System.out.println("Tuesday");
        break;


         case "WED":
            System.out.println("Wednesday");
     }
  }
}