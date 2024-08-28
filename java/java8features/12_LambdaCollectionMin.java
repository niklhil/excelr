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
  

         // min() method to get min price    
         Employee ee = employees.stream().min((e1, e2)->e1.salary > e2.salary ? 1: -1).get();    
         System.out.println(ee.salary);   
    }  
}  