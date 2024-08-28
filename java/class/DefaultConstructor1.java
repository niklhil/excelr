// If we add any constructor then default constructor is not provided by java compiler

class Employee
{
    int empId;
    String ename;
    double esalary;

    Employee(int id, String name, double salary)   //Parameterised constructor
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
       Employee empObj=new Employee(1,"Scott",25000.0);
       empObj.show();

       Employee empObj1=new Employee();  //CE
       empObj1.show();
    }
}