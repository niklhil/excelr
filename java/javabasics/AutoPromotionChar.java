class Main
{ 
  public static void main(String args[])
  {
     char x='A';
     char y='*';
     //char result=x+y;  //CE
     int result1=x+y;
     char result2=(char)(x+y);
     System.out.println("Result : "+result1); 
     System.out.println("Result : "+result2); 
  } 
}

