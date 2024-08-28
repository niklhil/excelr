class Employee
{
    int empId;
    String ename;
    double esalary;
    static int ecount;

    Employee() //Default constructor
    {
        this(0,null,0.0);
    }

    Employee(int id, String name, double salary)  //Parameterized constructor
    {
        empId=id;
        ename=name;
        esalary=salary;
        ecount++;
    } 

    void show()
    {
       System.out.println(empId);
       System.out.println(ename);
       System.out.println(esalary);
       System.out.println(ecount+"\n");
     }
}

class Main
{
   public static void main(String args[])
   {
       Employee empObj1=new Employee(1,"Scott",25000.0);
       empObj1.show();

       Employee empObj2=new Employee(2,"Rose",35000.0);
       empObj2.show();

       Employee empObj3=new Employee();
       empObj3.show(); 

       empObj1.show();
       empObj2.show();
       empObj3.show();
   }
}