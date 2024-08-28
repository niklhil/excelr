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
}  

 class Main
 {  
    public static void main(String args[])
    {  
        Set<Employee> employees=new HashSet<Employee>();  

        employees.add(new Employee(1,"Scott",10000));  
        employees.add(new Employee(2,"Rose",20000));  
        employees.add(new Employee(3,"Mark",90000));  
        employees.add(new Employee(4,"Bush",70000));  
        employees.add(new Employee(5,"Peter ",50000));  

        // count number of employees based on condition
        long count = employees.stream()  
               	    	            .filter(eee -> eee.salary < 70000)  
		            .count();  

        System.out.println(count);   
    }  
}  