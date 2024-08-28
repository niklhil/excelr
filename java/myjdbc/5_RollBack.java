// https://jar-download.com/artifacts/mysql/mysql-connector-java/8.0.11/source-code

import java.sql.*;
import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
   int count=0;
   Connection con=null;
   PreparedStatement pstmt=null;

   Scanner in = new Scanner(System.in);
   int eno=0;
    
   try 
   {
     System.out.println("Enter the emp Id : ");
     eno=in.nextInt();
               
     Class.forName("com.mysql.cj.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","nnnn");
     con.setAutoCommit(false);
     pstmt= con.prepareStatement("DELETE FROM emp WHERE empno=?");
     pstmt.setInt(1,eno);
     count=pstmt.executeUpdate();

     if(count > 0)
     {
           System.out.println(count+" record deleted!!");
           System.out.println("Do you want to rollback ? y/n");
           char c = in.next().charAt(0);    

           if((c=='Y') || (c=='y'))
           {
              con.rollback();
              System.out.println("Rollback successful.");
           }
          else
          {
             con.commit();
             System.out.println("Database committed.");
          }
          pstmt.close();
          con.close();
     }
    else
     {
         System.out.println(" Record not found!!");
     }
   }
   catch(ClassNotFoundException e)
   {
     e.printStackTrace();
   }
   catch(SQLException e)
   {
     e.printStackTrace();
   }
  }
}