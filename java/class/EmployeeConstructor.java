class Employee
{
   int empId;
   String ename;
   double esalary;

   Employee(int id, String name, double salary)
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

      System.out.println();

      Employee empObj1=new Employee(2,"Rose",35000.0);
      empObj1.show();
   }
}








