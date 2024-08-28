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
       System.out.println(empObj.empId);  //0
       System.out.println(empObj.ename); //null
       System.out.println(empObj.esalary); //0.0

       System.out.println();

       Employee empObj1=new Employee();
       System.out.println(empObj1.empId);  //0
       System.out.println(empObj1.ename); //null
       System.out.println(empObj1.esalary); //0.0
   }
}