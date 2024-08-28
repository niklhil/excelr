/* Serialization */

import java.io.*;

class Emp implements Serializable 
{
  int eid;
  String name;
  transient double salary;
  private static int count;

  public Emp(int eid,String name, double salary)
 {
    this.eid = eid;
    this.name = name;
    this.salary = salary;
    count++;
  }

  public String toString() {
    return "Empno=" + eid + "; Name=" + name + "; Salary=" + salary +"; Count : "+count;
  }
} 

class Main 
{
  public static void main(String args[]) {
    
    // Object serialization
    try {
          Emp emp = new Emp(100, "Scott", 25000.00);
          System.out.println("Emp: " + emp);

          FileOutputStream fos = new FileOutputStream("serial");
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(emp);
          oos.flush();
          oos.close();
        }
    catch(IOException e)
    {
      System.out.println("Exception during serialization: " + e);
      System.exit(0);
    }

    // Object deserialization
    try {
          Emp emp;
          FileInputStream fis = new FileInputStream("serial");
          ObjectInputStream ois = new ObjectInputStream(fis);
          emp = (Emp)ois.readObject(); 
          ois.close();
          System.out.println("Emp: " + emp);
        }
     catch(IOException e) {
         System.out.println("Exception during deserialization: " + e);
       }
      catch(ClassNotFoundException cne) {
        cne.printStackTrace();
     }
  }
}