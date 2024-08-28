class Employee 
{
  int empId ;
  String ename;
  double esalary;

 Employee(int id, String name,double salary)
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
  public static void main (String args[])
{
 Employee empobj = new Employee(1,"Swetha",50000.0);
 empobj.show();

 System.out.println();

 Employee empobj1=new Employee(2,"Suriya",700000.0);
 empobj1.show();

}
}