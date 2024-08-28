class Main
{
  public static void main(String args[])
  {
    Integer numObj1 = 10;   // Auto-boxing 
    Integer numObj2 = 20;   // Auto-boxing

    int sum = (numObj1 + numObj2);   // Auto-Unboxing  
    System.out.println("The sum is        :"+sum); 

    Character charObj = 'A'; // Auto-boxing    
    char chr= charObj;       // Auto-Unboxing
    System.out.println("The value of charObj  : "+charObj);
    System.out.println("The value of chr  : "+chr);

    //Boolean boolObj ="true"; // Invalid

    Boolean boolObj=true;   //AutoBoxing
    boolean bool = boolObj;// Auto-Unboxing
    System.out.println("The value of bool : " +bool);
  }
}