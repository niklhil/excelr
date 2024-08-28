/* 
public boolean equals(Object ref)

It is used to compare the references of objects. If two reference variables are pointing to same object it returns true otherwise it returns false.
*/

class Emp
{
  int id;
  String name;
  String city;

  Emp(){}

  Emp(int id, String name, String city)
  {
    this.id=id;
    this.name=name;
    this.city=city;
  }
}

class Main
{
  public static void main(String args[])
  {
     Emp emp1=new Emp(1,"Scott","Delhi");  //1000
     Emp emp2=new Emp(1,"Scott","Delhi");  //2000
     Emp e=emp2; //2000

     boolean r=emp1.equals(emp2);  
     System.out.println(r);  //false

     r=emp1.equals(emp1);
     System.out.println(r); //true

     r=e.equals(emp2);  
     System.out.println(r);   //true
   }
}