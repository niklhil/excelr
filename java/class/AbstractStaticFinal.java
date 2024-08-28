//Constructor can not be declared abstract / static / final

class Employee
{
    //Default constructor
   abstract static final Employee(){}  //CE

    //Parameterised constructor 
   abstract static final Employee(int id, String name, double salary){}  //CE

    //Copy constructor
    abstract static final Employee(Employee emp){}  //CE
}