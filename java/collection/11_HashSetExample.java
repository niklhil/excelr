import java.util.*;

class Main
{
   public static void main(String args[])
   {
       HashSet<Integer> hs=new HashSet<Integer>();
       hs.add(5);
       hs.add(1);
       hs.add(2);
       hs.add(3);
       hs.add(4);
       System.out.println(hs); //

       ArrayList<Integer> al=new ArrayList<Integer>(hs);
       System.out.println(al);

       Collections.sort(al); 
       Collections.reverse(al);
       System.out.println(al);   
   }
}