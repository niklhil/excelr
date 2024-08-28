/*
	ArrayDeque default capacity is 16
	ArrayDeque implements Deque interface 
	Deque allows insertion and removal of elements from both the ends. 
	ArrayDeque is not thread safe (not synchronized)
	ArrayDeque can be used as both queue(FIFO) and stack(LIFO). When it is used as stack, it is faster than stack and when it is used as queue, it is faster than linkedlist
	Iterator of ArrayDeque allows removal of elements. 
	ArrayDeque is implemented using traditional array.   
	It does not allow null value.
	It allows duplicate elements.
	It stores elements in insertion order.
*/

import java.util.ArrayDeque;
import java.util.Iterator;
 
class Main		
{
	public static void main(String... args) //Var-args feature
	{  
		ArrayDeque<String> aq= new ArrayDeque<String>(); //16
		aq.add("A");
		aq.add("B");
		aq.add("B");
		aq.add("C");
     	                System.out.println(aq);
		
		//offerFirst-adds elements at the front of the ArrayDeque 
		aq.offerFirst("D");
		
		//offerLast inserts the element at the end of the ArrayDeque 
		aq.offerLast("E");

                	System.out.println(aq);
		
		aq.pollFirst();		
		aq.pollLast();
	                System.out.println(aq);

		Iterator<String> itr= aq.iterator();
		
		while(itr.hasNext())
	                {
		     System.out.println(itr.next());
          		}
     }
}