/* 
      java.lang.Iterable -  has forEach(java.util.function.Consumer param)
      java.util.function.Consumer  - has  public abstract void accept(T);

       fruits.forEach(Consumer c);
       fruits.forEach(apply(x));
       fruits.forEach((fruit)->{System.out.println(fruit);});
 */

import java.util.*;  

class Main
{  
    public static void main(String[] args) {  
          
        Set<String> fruits=new HashSet<String>();  
        fruits.add("Apple");          
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");
        fruits.add("EggFruit");
        fruits.add("Dates");
        fruits.add("Fig");

        fruits.forEach((fruit)-> { System.out.println(fruit); });  
    }  
}