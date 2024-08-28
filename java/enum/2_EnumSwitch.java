enum Days
{
   SUN,MON,TUE,WED,THU,FRI,SAT;
}

enum WeekDays
{
   SUN,MON,TUE,WED,THU,FRI,SAT;
}

class Main
{
  public static void main(String args[])
  {
   // Days d=Days.THU;

     //Days d=WeekDays.SAT;  //CE
     Days d=Days.valueOf("SUN");
    //Days d=Days.valueOf("sUN"); //RTE

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