/*
    Queue follows the First-In-First-Out (FIFO) order.
    Allows null elements in most implementations.
    Elements are added at the back and removed from the front.
    Useful for task scheduling, messaging systems etc.
    Using Queue reference variable we can not invoke add(index,element)
*/

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class Main 
{
	public static void main(String[] args) 
                {
		                              
		Queue<String> fruits = new LinkedList<String>(); 

		//offer() - return true/false
		fruits.offer("Apple");
		fruits.offer(null); //No Error
		fruits.offer("Cherry");
		System.out.println(fruits);

		boolean flag = fruits.offer("Banana");
		System.out.println(flag);//true
		System.out.println(fruits);

		// add() - may throw IllegalStateException
		try {
			//fruits.add(1,"Dates"); //CE
			fruits.add("Dates");
			fruits.add("Dates");
			fruits.add(null);
			fruits.add("EggFruit");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

		System.out.println(fruits);
		System.out.println(fruits.peek());
		String head = null;

		try 
              	  	{
			head = fruits.remove();
			System.out.println(fruits.element());
		}
		catch (NoSuchElementException e) 
	                {
			e.printStackTrace();
		}

		System.out.println(fruits);
		
		// remove the head - poll()
		head = fruits.poll();
		System.out.println(fruits);
		System.out.println(fruits.peek());
		
		System.out.println(fruits.contains("EggFruit"));
		System.out.println(fruits.contains("Apple"));
	}
}