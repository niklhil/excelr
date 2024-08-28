/*
In a priority queue, elements are assigned priorities. Element with the highest priority is removed first. 
Its default capacity is 11.
It does not allow null value.
It can have duplicate elements.
Comparator implementation is used for ordering elements
Ordering ties between the PriorityQueue elements are decided arbitrarily.
PriorityQueue is not synchronized. PriorityBlockingQueue is the thread-safe counterpart of PriorityQueue.
PriorityQueue is unbounded and it grows dynamically based on the number of elements in the Queue. The iterator() of the PriorityQueue does not guarantee for traversal of the Queue elements in any particular order.
Performance wise; remove() and contains() methods take linear time. peek(), element() and size() take fixed time. 
*/

import java.util.*;  

class Main
{  
  public static void main(String args[])
 {  
   PriorityQueue<String> queue=new PriorityQueue<String>();  
   queue.add("Cherry");  
   queue.add("Dates");  
   queue.add("Apple");  
   queue.add("Banana");  
   queue.add("Banana");  
   queue.add("Mango");  

   System.out.println(queue);
  
   System.out.println("First element:"+queue.element());   // May throw NoSuchelementException  
   System.out.println("First element:"+queue.peek()+"\n"); //May return null  
  
   Iterator itr=queue.iterator();  

   while(itr.hasNext())
   {  
     System.out.println(itr.next());  
   }  
  
   queue.remove();  
   queue.poll();  
  
   System.out.println();

   Iterator<String> itr2=queue.iterator();  

   while(itr2.hasNext())
   {  
    System.out.println(itr2.next());  
   }  
  }  
}  