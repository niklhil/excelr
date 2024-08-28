/*
   BiFunction represents a function that accepts two arguments and produces a result. This is a functional interface whose functional method is apply(Object, Object).
*/

import java.util.function.BiFunction;  

class Operation
{  
 static String concat(String a, String b)
 {  
   return a+b;  
 }   
}  

class Main
{  
 public static void main(String args[])
 {  
    BiFunction<String, String, String> ref = Operation::concat;  
    String result = ref.apply("George"," Bush");  
    System.out.println(result);  
 }  
}  