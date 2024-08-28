class Employee
{
    int empId=1;
    String ename="Scott";
    double esalary=25000.0;
}

class Main
{
   public static void main(String args[])
   {
       Employee empObj=new Employee();
       System.out.println(empObj.empId);  //1
       System.out.println(empObj.ename); //Scott
       System.out.println(empObj.esalary); //25000.0

       System.out.println();

       Employee empObj1=new Employee();
       System.out.println(empObj1.empId);  //1
       System.out.println(empObj1.ename); //Scott
       System.out.println(empObj1.esalary); //25000.0
   }
}