import java.util.*;

class Employee
{
  int empId;
  String empName;
  String empAdd;

  public Employee(int eId, String eName, String eAdd)
  {
    empId=eId;
    empName=eName;
    empAdd=eAdd;    
  }

   public String toString()
   {
      return("\nempId :  " + empId + "\nempName :  "+empName + "\nempAdd :  "+empAdd);     
   }
}

class MyComp implements Comparator<Object>
{
	public int compare(Object obj1, Object obj2)
	{
		Employee emp1;
		Employee emp2;

		emp1 = (Employee) obj1;
		emp2 = (Employee) obj2;

		if(emp1.empId == emp2.empId)
   		{
		     return 0;
		}
		else if(emp1.empId > emp2.empId)
		{
		   return 1;	
		}
		else return -1;
	}
}

class Main
{
	public static void main(String[] args) 
	{
		// create a tree set
		TreeSet<Employee> ts = new TreeSet<Employee>(new MyComp());

		Employee emp1 = new Employee(001,"John","Chennai");
		Employee emp2 = new Employee(002,"Bob","Mumbai");
		Employee emp3 = new Employee(003,"Raj","Kolkata");
	     	Employee emp4 = new Employee(003,"Scott","UP");

		//add elements to the tree set
		ts.add(emp3);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp4);

		Iterator itr = ts.iterator();

		// Display elements
		while(itr.hasNext())
		{
			Employee emp =(Employee)itr.next();
			System.out.print(emp);
			System.out.println("\n");
		}
	}
}