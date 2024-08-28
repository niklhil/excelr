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
      System.out.println(esalary+"\n");
    }
}

class Main
{
   public static void main(String args[])
   {
      Employee empObj=new Employee(1,"Scott",25000.0);
      empObj.show();
      modify(empObj);
      empObj.show();
   }

   static void modify(Employee ref)
   {
        ref.esalary++;
   }
}