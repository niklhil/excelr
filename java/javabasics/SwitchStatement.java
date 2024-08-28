class Main
{
  public static void main(String args[])
  {
     char c='%';

     switch(c)  // byte, short, int, char, String & enum
     {
        case '+':   //byte, short, int, char, String & enum
           System.out.println("Addition");
        break;  

        case '-':
           System.out.println("Subtraction");
        break;  

        case '*':
           System.out.println("Multiplication");
        break;         

        case '/':
           System.out.println("Division");
        break;  

        default:
           System.out.println("Invalid entry");   
     }
  }
}