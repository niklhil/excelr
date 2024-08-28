// public boolean equals(StringBuffer sb)

class Main
{
  public static void main(String args[])
  {
     StringBuffer x=new StringBuffer("Scott");     
     StringBuffer y=new StringBuffer("Scott");     

     String s1=x.toString(); 
     String s2=y.toString();

     if(s1.equals(s2))
     {
       System.out.println("Same content");
     }
     else
     {
       System.out.println("Different contents");
     }
  }
}