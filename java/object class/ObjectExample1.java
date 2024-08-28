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

  public String toString()
  {
     return id+"\n"+
               name+"\n"+
               city+"\n";	 
  }
}

class Main
{
  public static void main(String args[])
  {
     Emp emp1=new Emp(1,"Scott","Bangalore");
     Emp emp2=new Emp(2,"John","Mumbai");

     System.out.println(emp1);
     System.out.println(emp2);
  }
}