// If we don't add any constructor then default constructor is provided by java compiler

class Employee
{
    int empId;
    String ename;
    double esalary;
}

class Main
{
   public static void main(String args[])
   {
       Employee empObj=new Employee();
       System.out.println(empObj);
   }
}