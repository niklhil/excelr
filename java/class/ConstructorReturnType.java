// Constructor becomes a method if return type is added to it.

class Employee
{
    int empId;
    String ename;
    double esalary;

    void Employee(int id, String name, double salary)   // Method
    {
       empId=id;
       ename=name;
       esalary=salary;
    }
  
    void show()
    {
       System.out.println(empId);
       System.out.println(ename);
       System.out.println(esalary);
    }
}

class Main
{
   public static void main(String args[])
   {
       Employee empObj=new Employee(1,"Scott",25000.0);  //CE
       empObj.show();

       // Employee empObj1=new Employee();
       // empObj1.show();

    }
}