import java.sql.*;

 class Main
 {
   public static void main(String args[]) {

      Connection con=null;

      try
      {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useSSL=false","root","nnnn");
           CallableStatement cs = con.prepareCall("{ CALL UpdateEmployeeSalary(7900) }");
           cs.execute();
           System.out.println("Database updated..");
           cs.close();
           con.close();
      }
      catch(SQLException ex) 
      {
        System.err.println("SQLException: " + ex.getMessage());
      }
      catch(ClassNotFoundException e) 
      {
        System.out.println(e.getMessage());
      }
   }
}

/*

DELIMITER //

CREATE PROCEDURE UpdateEmployeeSalary(eno INT)
BEGIN
    UPDATE emp SET sal = sal + 1 WHERE empno = eno;
END;

//
DELIMITER   ;

*/