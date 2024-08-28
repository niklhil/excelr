class Main
{
   public static void main(String args[])
   {
      //Boolean b =new Boolean(true);  //true
      //Boolean b =new Boolean("true"); //true
      //Boolean b =new Boolean("True"); //true
      //Boolean b =new Boolean("TRUE"); //true
      //Boolean b =new Boolean(True);  // CE 
      //Boolean b =new Boolean(1); //CE
      //Boolean b =new Boolean("Scott"); //false
      //Boolean b =new Boolean("0"); //false
      Boolean b =new Boolean("1"); //false

      System.out.println(b);
   }
}