// public String replace(char old, char new)
// public String replace(String old, String new)

class Main
{
   public static void main(String args[])
   {
     String s1="Mangalore";
     String r1=s1.replace('M','B');
     System.out.println(r1); //Bangalore

     System.out.println(s1.replace('M','B')); //Bangalore
     System.out.println(s1);  //Mangalore

     String s2="Java is difficult language";  
     String r2=s2.replace("difficult","easy");
     System.out.println(r2); //Easy
     System.out.println(s2);  //Difficult

     s2=s2.replace("difficult","easy"); 
     System.out.println(s2);  //Easy
  }
}