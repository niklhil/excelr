import java.util.Scanner;

enum Days
{
   SUN,MON,TUE,WED,THU,FRI,SAT;
}

class Main
{
  public static void main(String args[])
  {
     Days d=null;
     Scanner scr=new Scanner(System.in);
    
     try
     {
       System.out.println("Enter enum constant"); 
       d=Days.valueOf(scr.next()); 
     } 
     catch(IllegalArgumentException iae)
     {
       System.out.println("Enter valid constant");  
       main(null);
       return;
     }
   
     switch(d)
     {
	case SUN:
	  System.out.println("SUNDAY");	
	break;

	case MON:
	  System.out.println("MONDAY");	
	break;

	case TUE:
	  System.out.println("TUESDAY");	
	break;

	case WED:
	  System.out.println("WEDNESDAY");	
	break;

	case THU:
	  System.out.println("THURSDAY");	
	break;

	case FRI:
	  System.out.println("FRIDAY");	
	break;

	case SAT:
	  System.out.println("SATURDAY");	
     }		
  }
}