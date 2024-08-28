import java.util.Scanner;

class Main
{
  public static void main(String args[])
{
  Scanner scr=new Scanner (System.in);
  int size=0;
  
  System.out.println("Enter the  Array Size");
    size=scr.nextInt();

  int x[] = new int[size];
  
 for( int i=0; i<size ; i++)
 {
  System.out.println("Enter the Element"+ (i+1));
       x[i]=scr.nextInt(); 
 }
 System.out.println("******************");
 
 for ( int i=0; i<size; i++)
{
  System.out.println(x[i]);
}
}
}