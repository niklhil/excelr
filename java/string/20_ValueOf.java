// public static String valueOf(anyPrimitive)

class Main
{
  public static void main(String args[])
  {
     byte b=100;
     short s=150;
     int i=1000;
     long l=1000000L;
     float f=10.24F;
     double d=10.88;
     boolean bl=true;

     System.out.println(String.valueOf(b));  //100
     System.out.println(String.valueOf(s));  //150
     System.out.println(String.valueOf(i));  
     System.out.println(String.valueOf(l));      
     System.out.println(String.valueOf(f));  
     System.out.println(String.valueOf(d));  
     System.out.println(String.valueOf(bl)); 

     System.out.println(String.valueOf(b) + String.valueOf(s));  
   }                                
}