/* A stream is a sequence of elements that can be processed by a pipeline of various functionalities to transform, filter, and process those elements.*/

/*
    Stream interface has -  Stream filter(Predicate p)
    Predicate functional interface has - public abstract boolean test(x);
*/

import java.util.HashSet;
import java.util.Set;  
import java.util.stream.Stream;   

class Employee
{  
    int empno;  
    String ename;  
    double salary;

    Employee(int empno, String ename, double salary) 
    {  
        this.empno = empno;  
        this.ename = ename;  
        this.salary =  salary;  
    }  

    public String toString()
    {
      return empno+"\n"+
    	     ename+"\n"+
	     salary+"\n";
     }
}  

class Main
 {  
    public static void main(String args[])
    {  
        Set<Employee> employees=new HashSet<Employee>();  

        employees.add(new Employee(1,"Scott",10000));  
        employees.add(new Employee(2,"Rose",10000));  
        employees.add(new Employee(3,"Mark",30000));  
        employees.add(new Employee(4,"Bush",40000));  
        employees.add(new Employee(5,"Peter ",50000));  

        Stream<Employee> filteredEmployees =   
                               			employees.stream().filter((e) -> e.salary > 10000);  
	filteredEmployees.forEach(employee -> System.out.println(employee)); 


  	employees.stream()
	                 .filter(e -> e.salary > 10000)  
	                 .forEach((employee) -> System.out.println(employee.ename));  
    }  
}  