// public boolean equals(StringBuffer sb)

class Main
{
  public static void main(String args[])
  {
     StringBuffer x=new StringBuffer("Scott");     
     StringBuffer y=new StringBuffer("Scott");     

     if(x.equals(y))
     {
       System.out.println("Same reference");
     }
     else
     {
       System.out.println("Different references");
     }
  }
}