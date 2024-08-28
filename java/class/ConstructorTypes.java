class Employee
{
    int empId;
    String ename;
    double esalary;

    Employee(){}     //Default constructor

    Employee(int id, String name, double salary)     //Parameterised constructor
    {
        empId=id;
        ename=name;
        esalary=salary; 
    }

    Employee(Employee emp)    //Copy constructor
    {
         empId=emp.empId;
         ename=emp.ename; 
         esalary=emp.esalary;
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
      Employee empObj=new Employee();
      empObj.show();

      System.out.println();

      Employee empObj1=new Employee(1, "Scott", 25000.0);
      empObj1.show();

      System.out.println();

      Employee empObj2=new Employee(empObj1);
      empObj2.show();
   }
}