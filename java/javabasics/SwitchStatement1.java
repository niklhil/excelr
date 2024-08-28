class Main
{
  public static void main(String args[])
  {
     String day="MON";

     switch(day)
     {
         case "SUN":
           System.out.println("Sunday");
         break;

         default:
           System.out.println("Invalid entry");

         case "MON":
            System.out.println("Monday");

         case "TUE":
            System.out.println("Tuesday");

         case "WED":
            System.out.println("Wednesday");
     }
  }
}